package com.constructorandaccessmodifiers.levelone;

public class TestUniversity {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Harshal", 8.5, "Computer Science");

        pg.displayDetails();

        //Modifying CGPA using public setter
        pg.setCGPA(9.2);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

