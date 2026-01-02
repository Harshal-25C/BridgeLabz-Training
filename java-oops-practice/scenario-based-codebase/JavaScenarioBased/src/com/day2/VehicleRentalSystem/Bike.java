package com.day2.VehicleRentalSystem;

//Bike implementation
public class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber = "BIKE67890";

    Bike(String number, double rate){
        super(number, "Bike", rate);
    }

    public double calculateRentalCost(int days){
        return rentalRate * days;
    }

    public double calculateInsurance(){
        return 200;
    }

    public String getInsuranceDetails(){
        return "Bike Insurance (Policy Hidden)";
    }
}
