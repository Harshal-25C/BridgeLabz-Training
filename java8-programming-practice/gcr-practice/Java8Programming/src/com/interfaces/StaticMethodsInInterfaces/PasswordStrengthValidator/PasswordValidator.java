package com.interfaces.StaticMethodsInInterfaces.PasswordStrengthValidator;

public class PasswordValidator {

    public static void main(String[] args) {

        String password = "Secure@123";

        if(SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password");
        }else {
            System.out.println("Weak password");
        }
    }
}
