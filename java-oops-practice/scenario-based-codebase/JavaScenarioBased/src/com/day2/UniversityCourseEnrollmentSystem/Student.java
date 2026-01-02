package com.day2.UniversityCourseEnrollmentSystem;

public class Student {
	protected int studentId;
    protected String name;
    protected String courseName;
    //secured using encapsulation
    private double gpa; 

    //Constructor without elective preference
    Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    //Overloaded constructor with elective preference
    Student(int id, String name, String courseName) {
        this.studentId = id;
        this.name = name;
        this.courseName = courseName;
    }

    //Protected method to set GPA
    protected void setGpa(double gpa){
        this.gpa = gpa;
    }

    //Public method to view transcript
    public String getTranscript() {
        return "Student ID: " + studentId +
               ", Name: " + name +
               ", Course: " + courseName +
               ", GPA: " + gpa;
    }

    public void displayInfo(){
        System.out.println(getTranscript());
    }

}
