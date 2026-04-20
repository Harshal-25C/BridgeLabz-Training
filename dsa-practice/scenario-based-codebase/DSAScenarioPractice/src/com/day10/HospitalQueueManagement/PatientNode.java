package com.day10.HospitalQueueManagement;

class PatientNode {
    int patientId;
    String name;
    int arrivalTime;
    PatientNode left, right;

    PatientNode(int patientId, String name, int arrivalTime) {
        this.patientId = patientId;
        this.name = name;
        this.arrivalTime = arrivalTime;
    }
}
