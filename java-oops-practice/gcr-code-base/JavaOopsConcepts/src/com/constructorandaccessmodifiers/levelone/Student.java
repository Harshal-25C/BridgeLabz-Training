package com.constructorandaccessmodifiers.levelone;

public class Student{
	//Public member - accessible everywhere
    public int rollNumber;

    //Protected member - accessible within package and subclasses
    protected String name;

    //Private member - accessible only within this class
    private double CGPA;

    //Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    //Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    //Public method to set CGPA
    public void setCGPA(double CGPA){
        if (CGPA >= 0 && CGPA <= 10){
            this.CGPA = CGPA;
        }else{
            System.out.println("Invalid CGPA value");
        }
    }

}
