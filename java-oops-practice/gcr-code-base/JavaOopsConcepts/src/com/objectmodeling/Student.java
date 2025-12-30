package com.objectmodeling;
import java.util.*;

// Student class (Associated with Course)
class Student {
    String studentName;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String studentName) {
        this.studentName = studentName;
    }

    // Enroll student in a course
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Association is two-way
    }

    // Display enrolled courses
    void showCourses() {
        System.out.println(studentName + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}
