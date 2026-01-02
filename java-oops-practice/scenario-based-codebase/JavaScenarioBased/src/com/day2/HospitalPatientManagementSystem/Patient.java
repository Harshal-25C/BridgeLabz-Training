package com.day2.HospitalPatientManagementSystem;

public class Patient {

	protected int patientId;
    protected String name;
    protected int age;
    private String medicalHistory;

    //Constructor for normal admission
    Patient(int patientId, String name, int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.medicalHistory="Not Provided";
    }

    //Overloaded constructor for emergency admission
    Patient(int patientId, String name, int age, String medicalHistory){
        this.patientId=patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    //Public method exposing limited information
    public String getSummary(){
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    //Polymorphic method
    public void displayInfo(){
        System.out.println(getSummary());
    }

}
