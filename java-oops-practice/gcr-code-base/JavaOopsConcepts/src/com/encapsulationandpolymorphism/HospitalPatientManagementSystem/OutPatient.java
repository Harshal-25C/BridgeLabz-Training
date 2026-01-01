package com.encapsulationandpolymorphism.HospitalPatientManagementSystem;

class OutPatient extends Patient implements MedicalRecord{
 private double consultationFee;

 OutPatient(int id, String name, int age, double fee){
     super(id, name, age);
     this.consultationFee = fee;
 }

 public double calculateBill(){
     return consultationFee;
 }

 public void addRecord(String diagnosis){
     setDiagnosis(diagnosis);
 }

 public void viewRecords(){
     System.out.println("Diagnosis: " + getDiagnosis());
 }
}
