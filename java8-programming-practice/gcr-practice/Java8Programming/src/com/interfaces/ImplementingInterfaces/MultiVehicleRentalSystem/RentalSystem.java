package com.interfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class RentalSystem {
    public static void main(String[] args) {

        RentalVehicle vehicle = new Car();
        vehicle.rent();
        vehicle.returnVehicle();
    }
}
