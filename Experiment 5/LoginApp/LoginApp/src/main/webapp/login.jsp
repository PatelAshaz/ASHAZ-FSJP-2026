<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f2f2f2; }
        .login-box {
            width: 320px; margin: 100px auto; padding: 30px;
            background: #fff; border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.2);
        }
        h2 { text-align: center; color: #333; }
        input[type=text], input[type=password] {
            width: 100%; padding: 10px; margin: 8px 0;
            border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box;
        }
        input[type=submit] {
            width: 100%; padding: 10px; background: #4CAF50; color: #fff;
            border: none; border-radius: 4px; cursor: pointer; margin-top: 10px;
        }
        input[type=submit]:hover { background: #45a049; }
        .error { color: red; text-align: center; margin-top: 10px; }
    </style>
</head>
<body>
    <div class="login-box">
        <h2>Login</h2>
        <form action="LoginServlet" method="post">
            <label>Username:</label>
            <input type="text" name="username" required>
            <label>Password:</label>
            <input type="password" name="password" required>
            <input type="submit" value="Login">
        </form>
        <%
            String error = request.getParameter("error");
            if (error != null) {
        %>
            <p class="error">Invalid username or password. Please try again.</p>
        <%
            }
        %>
    </div>
</body>
</html>
