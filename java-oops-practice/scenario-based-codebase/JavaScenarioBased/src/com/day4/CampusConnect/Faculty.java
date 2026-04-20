package com.day4.CampusConnect;

class Faculty extends Person{

    Faculty(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    void printDetails() {
        System.out.println("Faculty: " + name + ", Email: " + email);
    }
}