package com.day4.PatientSortingbyCriticality;

import java.util.List;

public class HospitalQueue {
    public static void sortByCriticality(List<Patient> patients) {

        int n = patients.size();

        for(int i=0; i<n-1; i++) {
            for(int j=0; j < n-i-1; j++) {

                if(patients.get(j).getCriticality() < patients.get(j+1).getCriticality()) {

                    //Swap adjacent patients
                    Patient temp = patients.get(j);
                    patients.set(j, patients.get(j+1));
                    patients.set(j+1, temp);
                }
            }
        }
    }
}
