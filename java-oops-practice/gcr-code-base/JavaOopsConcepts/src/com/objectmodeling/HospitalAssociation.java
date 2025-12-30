package com.objectmodeling;

public class HospitalAssociation {
 public static void main(String[] args) {

     Hospital hospital = new Hospital("City Hospital");

     Doctor d1 = new Doctor("Dr. Kumar");
     Doctor d2 = new Doctor("Dr. Singh");

     Patient p1 = new Patient("Amit");
     Patient p2 = new Patient("Neha");

     hospital.addDoctor(d1);
     hospital.addDoctor(d2);
     hospital.addPatient(p1);
     hospital.addPatient(p2);

     // Doctor-patient communication
     d1.consult(p1);
     d1.consult(p2);
     d2.consult(p1);
 }
}
