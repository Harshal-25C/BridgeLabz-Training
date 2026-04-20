package com.objectmodeling;

public class UniversityCompositionAggregation {
 public static void main(String[] args) {

     // Faculty can exist independently
     Faculty f1 = new Faculty("Dr. Sharma");
     Faculty f2 = new Faculty("Dr. Mehta");

     // Create University
     University uni = new University("National University");

     // Create Departments (Composition)
     Department d1 = new Department("Computer Science");
     Department d2 = new Department("Mechanical");

     uni.addDepartment(d1);
     uni.addDepartment(d2);

     // Add faculty (Aggregation)
     uni.addFaculty(f1);
     uni.addFaculty(f2);

     uni.showUniversityDetails();
     //If university object is removed, departments are gone
 }
}
