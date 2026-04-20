package com.day3.CabbyGo;

public class CabbyGoApp{
    public static void main(String[] args){

        Vehicle v = new Sedan("MH12AB1234"); //Polymorphism
        Driver d = new Driver("Rohit", "LIC98765", 4.7);

        IRideService ride = new RideService(v, d);
        ride.bookRide(12);
        ride.endRide();
    }
}