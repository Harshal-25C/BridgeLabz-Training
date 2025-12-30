package com.objectmodeling;

public class UniversityManagement{
 public static void main(String[] args){

     Student s1 = new Student("Anjali");
     Professor p1 = new Professor("Dr. Verma");

     Course c1 = new Course("Data Structures");
     Course c2 = new Course("Operating Systems");

     s1.enrollCourse(c1);
     s1.enrollCourse(c2);

     p1.assignProfessor(c1);
 }
}

