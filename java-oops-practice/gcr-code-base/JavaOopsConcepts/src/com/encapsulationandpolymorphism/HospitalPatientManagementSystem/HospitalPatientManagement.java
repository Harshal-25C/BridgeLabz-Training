package com.encapsulationandpolymorphism.HospitalPatientManagementSystem;
import java.util.*;

public class HospitalPatientManagement{
 public static void main(String[] args){

     List<Patient> patients = new ArrayList<>();

     Patient p1 = new InPatient(101, "Rahul", 45, 5, 3000);
     Patient p2 = new OutPatient(102, "Sneha", 30, 800);

     ((MedicalRecord) p1).addRecord("Pneumonia");
     ((MedicalRecord) p2).addRecord("Fever");

     patients.add(p1);
     patients.add(p2);

     for(Patient p:patients){
         p.getPatientDetails();
         ((MedicalRecord) p).viewRecords();
         System.out.println("--------------------------");
     }
 }
}

