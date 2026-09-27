<%@ page language="java" %>
<%@ page import="java.util.Date" %>
<html>
    <head>
        <title>Welcome Page</title>
    </head>
    <body>

        <h1>Welcome to RCOE</h1>
        <h2>Good Morning, <%= request.getParameter("name") %></h2>
        <p>Email ID: <i><% out.print(request.getParameter("email")); %></i></p>
        <h3>Current Date and Time: <b><%= new Date() %></b></h3>

    </body>
</html>
