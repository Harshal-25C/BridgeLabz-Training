package com.day3.CabbyGo;

abstract class Vehicle{
 protected String vehicleNumber;
 protected int capacity;
 protected String type;
 protected double ratePerKm;
 private double fare; 

 //Constructor to initialize vehicle
 Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm){
     this.vehicleNumber = vehicleNumber;
     this.capacity = capacity;
     this.type = type;
     this.ratePerKm = ratePerKm;
 }

 //Calculate fare using operators
 public void calculateFare(double distance){
     fare = 50 + (distance * ratePerKm);
 }

 //Getter for fare
 public double getFare(){
     return fare;
 }
}

