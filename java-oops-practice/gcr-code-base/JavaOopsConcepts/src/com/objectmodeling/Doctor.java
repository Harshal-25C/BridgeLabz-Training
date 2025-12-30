package com.objectmodeling;

import java.util.ArrayList;

//Doctor class
class Doctor {
 String doctorName;
 ArrayList<Patient> patients = new ArrayList<>();

 Doctor(String doctorName) {
     this.doctorName = doctorName;
 }

 // Communication method
 void consult(Patient patient) {
     patients.add(patient);
     System.out.println("Doctor " + doctorName +
             " is consulting patient " + patient.patientName);
 }
}


