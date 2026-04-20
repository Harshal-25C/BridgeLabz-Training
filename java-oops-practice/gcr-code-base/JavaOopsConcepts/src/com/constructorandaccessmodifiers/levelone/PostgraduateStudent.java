package com.constructorandaccessmodifiers.levelone;

public class PostgraduateStudent extends Student{

    String specialization;

    //Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    //Method to display details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name);     
        System.out.println("CGPA: " + getCGPA());    
        System.out.println("Specialization: " + specialization);
    }
}

