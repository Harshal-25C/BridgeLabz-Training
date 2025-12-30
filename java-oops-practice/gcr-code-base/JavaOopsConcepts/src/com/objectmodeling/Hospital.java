package com.objectmodeling;

import java.util.ArrayList;

//Hospital class
class Hospital{
 String hospitalName;
 ArrayList<Doctor> doctors = new ArrayList<>();
 ArrayList<Patient> patients = new ArrayList<>();

 Hospital(String hospitalName){
     this.hospitalName = hospitalName;
 }

 void addDoctor(Doctor doctor) {
     doctors.add(doctor);
 }

 void addPatient(Patient patient) {
     patients.add(patient);
 }
}

