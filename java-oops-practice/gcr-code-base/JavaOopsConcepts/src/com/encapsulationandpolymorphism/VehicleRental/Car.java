package com.encapsulationandpolymorphism.VehicleRental;

class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber = "CAR12345";

    Car(String number, double rate) {
        super(number, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance (Policy Hidden)";
    }
}
