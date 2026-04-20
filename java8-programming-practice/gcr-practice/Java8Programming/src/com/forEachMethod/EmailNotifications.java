package com.forEachMethod;

import java.util.*;

public class EmailNotifications {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "user2@gmail.com",
                "user3@gmail.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }
}
