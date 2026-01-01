package com.encapsulationandpolymorphism.VehicleRental;

abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    //Constructor to initialize vehicle details
    Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //Abstract method to calculate rental cost
    abstract double calculateRentalCost(int days);

    //Method to display common details
    public void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
    }
}
