package com.objectmodeling;

import java.util.ArrayList;

//University class
class University {
 String universityName;
 ArrayList<Department> departments = new ArrayList<>();
 ArrayList<Faculty> faculties = new ArrayList<>();

 University(String universityName) {
     this.universityName = universityName;
 }

 void addDepartment(Department dept) {
     departments.add(dept);
 }

 void addFaculty(Faculty faculty) {
     faculties.add(faculty);
 }

 void showUniversityDetails() {
     System.out.println("\nUniversity: " + universityName);

     System.out.println("Departments:");
     for (Department d : departments) {
         System.out.println("- " + d.departmentName);
     }

     System.out.println("Faculty Members:");
     for (Faculty f : faculties) {
         System.out.println("- " + f.facultyName);
     }
 }
}
