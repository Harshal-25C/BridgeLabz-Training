package com.day6.VehicleMaintenanceScheduler;

class Vehicle {
    String id;
    int mileage;

    Vehicle(String id, int mileage) {
        this.id = id;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return id+" (Mileage: "+mileage+")";
    }
}
