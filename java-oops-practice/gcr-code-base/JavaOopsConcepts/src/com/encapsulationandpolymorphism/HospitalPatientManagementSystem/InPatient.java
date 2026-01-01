package com.encapsulationandpolymorphism.HospitalPatientManagementSystem;

class InPatient extends Patient implements MedicalRecord{
 private int daysAdmitted;
 private double dailyCharge;

 InPatient(int id, String name, int age, int days, double charge){
     super(id, name, age);
     this.daysAdmitted = days;
     this.dailyCharge = charge;
 }

 public double calculateBill() {
     return daysAdmitted * dailyCharge;
 }

 public void addRecord(String diagnosis) {
     setDiagnosis(diagnosis);
 }

 public void viewRecords() {
     System.out.println("Diagnosis: " + getDiagnosis());
 }
}
