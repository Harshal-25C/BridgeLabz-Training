package com.encapsulationandpolymorphism.VehicleRental;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber = "TRUCK45678";

    Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance (Policy Hidden)";
    }
}

