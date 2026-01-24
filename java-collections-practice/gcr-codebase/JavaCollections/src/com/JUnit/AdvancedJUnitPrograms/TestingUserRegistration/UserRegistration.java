package com.JUnit.AdvancedJUnitPrograms.TestingUserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

    //Register a user with username, email, and password
    public static boolean registerUser(String username, String email, String password) {
    	
        if(username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (email == null || !Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        //Validate password (at least 8 characters, 1 uppercase, 1 digit)
        if(password == null || password.length() < 8 || !password.chars().anyMatch(Character::isUpperCase)
            || !password.chars().anyMatch(Character::isDigit)) {
            throw new IllegalArgumentException("Password does not meet strength requirements.");
        }

        return true;
    }
}
