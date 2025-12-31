package com.inheritance.assistedproblems;

class Motorcycle extends Vehicle{

    Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Two Wheeler");
    }
}
