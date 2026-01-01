package com.encapsulationandpolymorphism.RideHailingApplication;

abstract class Vehicle {
 private String vehicleId;
 private String driverName;
 protected double ratePerKm;

 // Constructor
 Vehicle(String vehicleId, String driverName, double ratePerKm) {
     this.vehicleId = vehicleId;
     this.driverName = driverName;
     this.ratePerKm = ratePerKm;
 }

 // Abstract method for fare calculation
 abstract double calculateFare(double distance);

 // Concrete method to display details
 public void getVehicleDetails() {
     System.out.println("Vehicle ID: " + vehicleId);
     System.out.println("Driver Name: " + driverName);
 }
}
