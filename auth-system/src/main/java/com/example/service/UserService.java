package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;

public class UserService {

    private UserDao userDao;

    // Constructor to initialize the DAO layer
    public UserService() {
        this.userDao = new UserDao(); // Direct initialization of UserDao
    }

    // Method to register a new user
    public boolean registerUser(String username, String password) {
        // Check if the username already exists in the database
        if (userDao.findUserByUsername(username) != null) {
            return false; // Username already taken
        }

        // Create a new User object and save it
        User newUser = new User(username, password);

        userDao.saveUser(newUser);
        return true; // Registration successful
    }

    // Method to validate login
    public boolean loginUser(String username, String password) {
        User user = userDao.findUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return true; // Login successful
        }

        return false; // Invalid credentials
    }

    public User getUserByUsername(String username){
        return userDao.findUserByUsername(username);
    }
}
