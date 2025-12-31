package com.inheritance.singleinheritance;

class Device{
    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}
