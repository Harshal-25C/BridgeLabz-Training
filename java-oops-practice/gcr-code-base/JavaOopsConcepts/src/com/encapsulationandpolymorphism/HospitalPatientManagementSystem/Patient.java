package com.encapsulationandpolymorphism.HospitalPatientManagementSystem;

abstract class Patient {
 private int patientId;
 private String name;
 private int age;
 private String diagnosis; // sensitive data (encapsulated)

 // Constructor
 Patient(int patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
 }

 // Abstract method for bill calculation
 abstract double calculateBill();

 // Concrete method to display patient details
 public void getPatientDetails() {
     System.out.println("Patient ID: " + patientId);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Bill Amount: ₹" + calculateBill());
 }

 // Protected access for subclasses only
 protected void setDiagnosis(String diagnosis) {
     this.diagnosis = diagnosis;
 }

 protected String getDiagnosis() {
     return diagnosis;
 }
}

