package com.constructorandaccessmodifiers.levelone;

public class CarRental{

	String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    //Default constructor
    CarRental(){
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.costPerDay = 50.0;
    }

    //Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double costPerDay){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    //Copy constructor
    CarRental(CarRental cr){
        this.customerName = cr.customerName;
        this.carModel = cr.carModel;
        this.rentalDays = cr.rentalDays;
        this.costPerDay = cr.costPerDay;
    }

    // Method to calculate total cost
    double totalCost(){
        return rentalDays*costPerDay;
    }

    void displayRental(){
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: $" + costPerDay);
        System.out.println("Total Cost: $" + totalCost());
    }

    public static void main(String[] args){
        CarRental rental1 = new CarRental();
        rental1.displayRental();

        System.out.println();

        CarRental rental2 = new CarRental("Harshal", "SUV", 5, 100.0);
        rental2.displayRental();

        System.out.println();

        CarRental rental3 = new CarRental(rental2); // copy
        rental3.displayRental();
    }
}
