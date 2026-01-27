package com.interfaces.DefaultMethodsInInterfaces.SmartVehicleDashboard;

public class Dashboard {
    public static void main(String[] args) {
        Vehicle v1 = new PetrolCar();
        Vehicle v2 = new ElectricCar();

        v1.displayBattery();  // default
        v2.displayBattery();  // overridden
    }
}
