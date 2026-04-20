package com.day2.UniversityCourseEnrollmentSystem;

public class Faculty implements Graded {
    private String facultyName;
    private Student student;

    Faculty(String name,Student student){
        this.facultyName =name;
        this.student = student;
    }

    //Assign grade and calculate GPA
    public void assignGrade(double grade){
        double gpa = grade/10; 
        student.setGpa(gpa);
    }

    public void displayFaculty(){
        System.out.println("Faculty: " + facultyName);
    }
}