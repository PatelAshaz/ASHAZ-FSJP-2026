<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello User</title>
</head>
<body>
    <h2>Hello from JSP!</h2>
    <form action="welcome" method="get">
        <label for="username">Enter Your Name:</label>
        <input type="text" name="username" id="username" placeholder="Name">

        <br>

        <label for="age">Enter Your Age:</label>
        <input type="text" id="age" name="age" placeholder="Age">
        <br>
        <button type="submit">Submit</button>
    </form>

    <br><br>
    <a href="Add.jsp">Click Here For Adding Two Numbers!</a>
</body>
</html>