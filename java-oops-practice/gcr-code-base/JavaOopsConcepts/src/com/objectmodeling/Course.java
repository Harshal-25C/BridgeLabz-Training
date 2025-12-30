package com.objectmodeling;
import java.util.*;

class Course{
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    // Add student to course
    void addStudent(Student student) {
        students.add(student);
    }

    // Display students enrolled in the course
    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.studentName);
        }
    }
}
