package com.day2.TrafficManager;

public class VehicleNode {
    String vehicleNumber;
    VehicleNode next;

    VehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
