package com.day6.ParkEase;

public class ParkEaseApp{
    public static void main(String[] args){

        Vehicle car = new Car("MH12AB1234");
        Vehicle bike = new Bike("MH14XY5678");

        ParkingSlot slot1 = new ParkingSlot("S1", "Car");
        ParkingSlot slot2 = new ParkingSlot("S2", "Bike");

        if(slot1.assignSlot(car)){
            System.out.println("Car parked successfully.");
            System.out.println("Charges: ₹" + car.calculateCharges(7));
            slot1.releaseSlot();
        }

        if(slot2.assignSlot(bike)){
            System.out.println("Bike parked successfully.");
            System.out.println("Charges: ₹" + bike.calculateCharges(4));
            slot2.releaseSlot();
        }

        System.out.println(slot1.getBookingLog());
        System.out.println(slot2.getBookingLog());
    }
}
