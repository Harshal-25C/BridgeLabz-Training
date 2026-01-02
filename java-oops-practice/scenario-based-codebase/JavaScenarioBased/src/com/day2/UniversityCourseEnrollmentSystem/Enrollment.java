package com.day2.UniversityCourseEnrollmentSystem;

public class Enrollment{
    Student student;
    Course course;

    Enrollment(Student student, Course course){
        this.student = student;
        this.course = course;
    }

    public void enroll(){
        System.out.println(student.name + " enrolled in " + course.courseName);
    }
}
