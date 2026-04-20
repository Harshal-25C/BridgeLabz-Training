package com.encapsulationandpolymorphism.RideHailingApplication;

class Bike extends Vehicle implements GPS{
 private String location = "Unknown";

 Bike(String id, String driver){
     super(id, driver, 8);
 }

 public double calculateFare(double distance){
     return distance*ratePerKm;
 }

 public String getCurrentLocation(){
     return location;
 }

 public void updateLocation(String location){
     this.location = location;
 }
}
