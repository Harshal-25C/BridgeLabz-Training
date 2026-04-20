package com.JUnit.AdvancedJUnitPrograms.TestingPasswordStrengthValidator;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for(char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        return hasUppercase && hasDigit;
    }
}
