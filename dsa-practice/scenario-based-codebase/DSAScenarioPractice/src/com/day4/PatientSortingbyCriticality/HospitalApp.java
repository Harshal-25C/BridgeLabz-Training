package com.day4.PatientSortingbyCriticality;

import java.util.*;

//Bubble Sort
public class HospitalApp {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Ravi", 4));
        patients.add(new Patient("Anita", 9));
        patients.add(new Patient("Suresh", 6));

        HospitalQueue.sortByCriticality(patients);

        for(Patient p:patients) {
            System.out.println(p);
        }
    }
}
