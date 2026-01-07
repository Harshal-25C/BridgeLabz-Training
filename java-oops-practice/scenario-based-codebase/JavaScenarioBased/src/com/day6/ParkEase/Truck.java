package com.day6.ParkEase;

public class Truck extends Vehicle{
    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours=4;
        double penalty = hours > allowedHours?(hours-allowedHours)*40:0;
        return (baseRate*hours) + penalty;
    }
}
