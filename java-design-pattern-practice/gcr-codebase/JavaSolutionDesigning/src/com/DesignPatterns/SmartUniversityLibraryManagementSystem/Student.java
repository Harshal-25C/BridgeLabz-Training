package com.DesignPatterns.SmartUniversityLibraryManagementSystem;

class Student implements User {
    public void getPrivileges() {
        System.out.println("Student: Limited borrowing days");
    }
}

class Faculty implements User {
    public void getPrivileges() {
        System.out.println("Faculty: Extended borrowing days");
    }
}

class Librarian implements User {
    public void getPrivileges() {
        System.out.println("Librarian: Manages inventory");
    }
}
