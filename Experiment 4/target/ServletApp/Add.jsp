<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Addition</title>
</head>
<body>
        <h2>Hello from JSP!</h2>
    <form action="hi" method="post">
        <label for="num1">Enter First Number:</label>
        <input type="text" name="num1" id="num1" placeholder="num1">

        <br>

        <label for="num2">Enter Second Number:</label>
        <input type="text" id="num2" name="num2" placeholder="num2">
        <br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
