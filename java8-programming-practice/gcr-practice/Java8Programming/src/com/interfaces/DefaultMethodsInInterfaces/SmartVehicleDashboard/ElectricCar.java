package com.interfaces.DefaultMethodsInInterfaces.SmartVehicleDashboard;

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 65%");
    }
}
