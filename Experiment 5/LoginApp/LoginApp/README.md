# JSP + Servlet + JDBC Login App — Setup Guide (VS Code)

## What you need installed first
1. **JDK 17+** — `java -version` to check.
2. **Apache Tomcat 10.x** (this project uses `jakarta.servlet.*` imports, which requires
   Tomcat **10 or newer**. If you must use Tomcat 9, see the note at the bottom.)
3. **MySQL Server** + MySQL Workbench (or the `mysql` CLI).
4. **VS Code** with these extensions:
   - "Extension Pack for Java" (Microsoft)
   - "Community Server Connectors" or "Tomcat for Java" (for deploying to Tomcat from VS Code)

## Project structure
```
LoginApp/
├── database_setup.sql
├── src/main/java/com/login/
│   ├── DBConnection.java
│   ├── LoginServlet.java
│   └── LogoutServlet.java
└── src/main/webapp/
    ├── login.jsp
    ├── welcome.jsp
    └── WEB-INF/
        ├── web.xml
        └── lib/   <- put MySQL connector JAR here
```

## Step 1 — Set up the database
1. Open MySQL Workbench (or terminal) and run `database_setup.sql`:
   ```
   mysql -u root -p < database_setup.sql
   ```
   This creates `logindb` with a `users` table and one test row (`admin` / `admin123`).

## Step 2 — Download the MySQL JDBC driver
1. Download the "MySQL Connector/J" JAR (e.g. `mysql-connector-j-8.4.0.jar`) from
   https://dev.mysql.com/downloads/connector/j/
2. Place the JAR file inside `src/main/webapp/WEB-INF/lib/`.
   (Tomcat automatically loads every JAR in `WEB-INF/lib`.)

## Step 3 — Update your DB credentials
Open `DBConnection.java` and edit these three lines to match your MySQL setup:
```java
private static final String URL = "jdbc:mysql://localhost:3306/logindb?useSSL=false&serverTimezone=UTC";
private static final String USER = "root";
private static final String PASSWORD = "your_mysql_password";
```

## Step 4 — Open the project as a Java Web project
The simplest way to get Tomcat + JSP/Servlets working reliably in VS Code:

1. In VS Code, open the `LoginApp` folder (`File > Open Folder`).
2. Make sure the **Extension Pack for Java** has finished indexing (check the bottom status bar).
3. Install/open the **Tomcat** extension (Community Server Connectors, or "Tomcat for Java").
4. In the Tomcat extension's sidebar, click **"Add Tomcat Server"** and point it to your
   local Tomcat 10 installation folder.
5. Right-click your Tomcat server in the sidebar → **"Add Deployment"** (or drag the
   `LoginApp` folder onto it) → select the `LoginApp` project.
   - The extension needs the project laid out as a standard webapp: `src/main/webapp` as
     the web root and compiled classes under `WEB-INF/classes`. If it doesn't
     auto-detect this Maven-style layout, the more foolproof route (Step 4B) is to
     compile manually — see below.

### Step 4B — Manual compile + deploy (most reliable, no build tool needed)
If the VS Code Tomcat extension doesn't pick up the layout automatically, just compile
and copy the files straight into Tomcat's `webapps` folder:

```bash
cd LoginApp

# 1. Compile the servlets, using Tomcat's own servlet-api jar for the classpath
javac -cp "/path/to/tomcat/lib/servlet-api.jar" \
  -d src/main/webapp/WEB-INF/classes \
  src/main/java/com/login/*.java

# 2. Copy the whole webapp folder into Tomcat as a new app
cp -r src/main/webapp /path/to/tomcat/webapps/LoginApp
```
(On Windows, use `xcopy` or just drag-and-drop the `webapp` folder's contents into
`Tomcat\webapps\LoginApp\` via File Explorer.)

Make sure `mysql-connector-j-*.jar` ends up in
`Tomcat\webapps\LoginApp\WEB-INF\lib\` (Step 2 already puts it there if you copy the
whole folder).

## Step 5 — Start Tomcat
- From VS Code's Tomcat extension: right-click the server → **Start**.
- Or manually:
  ```bash
  cd /path/to/tomcat/bin
  ./startup.sh      # Mac/Linux
  startup.bat       # Windows
  ```

## Step 6 — Test it
Open a browser to:
```
http://localhost:8080/LoginApp/login.jsp
```
- Log in with `admin` / `admin123` → redirects to `welcome.jsp`.
- Log in with wrong credentials → redirects back to `login.jsp` with an error message.
- Click **Logout** on the welcome page to end the session.

## Troubleshooting
- **HTTP 404 on login.jsp** → the app didn't deploy; check Tomcat's `webapps` folder
  actually contains `LoginApp/login.jsp`.
- **HTTP 500 / ClassNotFoundException for com.mysql.cj.jdbc.Driver** → the MySQL
  connector JAR isn't in `WEB-INF/lib`.
- **SQLException: Access denied** → wrong username/password in `DBConnection.java`.
- **Communications link failure** → MySQL isn't running, or wrong port (default 3306).
- **Using Tomcat 9 instead of 10**: Tomcat 9 uses the old `javax.servlet.*` package,
  not `jakarta.servlet.*`. In that case, replace every `jakarta.servlet` import in
  `LoginServlet.java` and `LogoutServlet.java` with `javax.servlet`, and use a
  matching older MySQL connector if needed.

## Security note
This is a teaching example: passwords are stored and compared in plain text, which is
fine for a lab assignment but never for a real application. In production you'd hash
passwords (e.g. bcrypt) and never compare them with `SELECT * WHERE password = ?`.
