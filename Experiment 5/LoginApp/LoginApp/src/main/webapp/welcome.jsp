<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f2f2f2; text-align: center; margin-top: 100px; }
        .box { background: #fff; width: 320px; margin: 0 auto; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.2); }
        a { display: inline-block; margin-top: 15px; text-decoration: none; color: #fff; background: #4CAF50; padding: 8px 16px; border-radius: 4px; }
    </style>
</head>
<body>
    <div class="box">
        <h2>Welcome, <%= session.getAttribute("username") %>!</h2>
        <p>You have successfully logged in.</p>
        <a href="LogoutServlet">Logout</a>
    </div>
</body>
</html>
