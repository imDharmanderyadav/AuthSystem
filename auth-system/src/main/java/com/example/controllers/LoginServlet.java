package com.example.controllers;

import javax.servlet.*;
import javax.servlet.http.*;

import com.example.entity.User;
import com.example.service.UserService;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        super.init();
        userService = new UserService(); // Initialize UserService
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Use UserService to validate login credentials
        boolean isLoginSuccessful = userService.loginUser(username, password);

        if (isLoginSuccessful) {
            User user = userService.getUserByUsername(username); // Get user details
            HttpSession session = request.getSession();
            session.setAttribute("user", user); // Store user in session
            response.sendRedirect("dashboard.jsp?username="+user.getUsername()); // Redirect to welcome page (without extension)
        } else {
            response.getWriter().println("Invalid credentials"); // Display error message
        }
    }
}
