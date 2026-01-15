package com.day4.PatientSortingbyCriticality;

public class Patient {
    private String name;
    private int criticality; //1 (low) to 10 (high)

    public Patient(String name, int criticality) {
        this.name=name;
        this.criticality=criticality;
    }

    public int getCriticality() {
        return criticality;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name+" (Criticality: " + criticality + ")";
    }
}
