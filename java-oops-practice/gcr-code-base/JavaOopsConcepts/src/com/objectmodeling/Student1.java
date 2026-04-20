package com.objectmodeling;

import java.util.ArrayList;

//Student class
class Student1{
 String studentName;
 ArrayList<Course> courses = new ArrayList<>();

 Student1(String studentName) {
     this.studentName = studentName;
 }

 void enrollCourse(Course course) {
     courses.add(course);
     System.out.println(studentName + " enrolled in " + course.courseName);
 }
}


