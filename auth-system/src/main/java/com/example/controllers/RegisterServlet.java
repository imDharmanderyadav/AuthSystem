package com.example.controllers;

import javax.servlet.*;
import javax.servlet.http.*;

import com.example.service.UserService;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        super.init();
        userService = new UserService(); // Initialize UserService
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Call UserService to register the user
        boolean isRegistrationSuccessful = userService.registerUser(username, password);

        if (isRegistrationSuccessful) {
            response.sendRedirect("login.html"); // Redirect to login page after successful registration
        } else {
            response.getWriter().println("User already exists. Please choose a different username.");
        }
    }
}
