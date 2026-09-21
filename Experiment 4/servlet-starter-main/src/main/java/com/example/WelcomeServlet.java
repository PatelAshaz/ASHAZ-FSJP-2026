package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/welcome")
public class WelcomeServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the value typed into the input field named "name"
        String name = request.getParameter("name");

        if (name == null || name.trim().isEmpty()) {
            name = "Guest";
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Welcome</title></head>");
        out.println("<body>");
        out.println("  <h1>Welcome I am " + name.trim() + "</h1>");
        out.println("  <br><a href='index.html'>Back to Form</a>");
        out.println("</body>");
        out.println("</html>");
    }
}