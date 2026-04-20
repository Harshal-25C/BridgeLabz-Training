package com.interfaces.StaticMethodsInInterfaces.PasswordStrengthValidator;

interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        if(password == null) return false;

        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*].*");
    }
}
