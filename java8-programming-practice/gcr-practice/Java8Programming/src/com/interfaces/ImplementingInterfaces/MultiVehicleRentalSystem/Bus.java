package com.interfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

class Bus implements RentalVehicle {
    public void rent() {
        System.out.println("Bus rented");
    }

    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
