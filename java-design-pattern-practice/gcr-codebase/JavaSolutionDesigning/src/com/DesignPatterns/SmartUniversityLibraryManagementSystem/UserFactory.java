package com.DesignPatterns.SmartUniversityLibraryManagementSystem;

class UserFactory {
    public static User createUser(String role) {

        return switch (role.toLowerCase()) {
            case "student" -> new Student();
            case "faculty" -> new Faculty();
            case "librarian" -> new Librarian();
            default -> throw new IllegalArgumentException("Invalid user role");
        };
    }
}
