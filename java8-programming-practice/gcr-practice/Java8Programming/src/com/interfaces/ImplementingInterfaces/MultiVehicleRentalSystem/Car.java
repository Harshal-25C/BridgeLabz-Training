package com.interfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

class Car implements RentalVehicle {
    public void rent() {
        System.out.println("Car rented");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
}
