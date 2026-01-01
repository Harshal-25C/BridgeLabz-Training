package com.encapsulationandpolymorphism.RideHailingApplication;

class Car extends Vehicle implements GPS {
 private String location = "Unknown";

 Car(String id, String driver) {
     super(id, driver, 15);
 }

 public double calculateFare(double distance) {
     return distance * ratePerKm;
 }

 public String getCurrentLocation() {
     return location;
 }

 public void updateLocation(String location) {
     this.location = location;
 }
}
