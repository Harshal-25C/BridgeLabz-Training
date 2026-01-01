package com.encapsulationandpolymorphism.RideHailingApplication;

class Auto extends Vehicle implements GPS{
 private String location = "Unknown";

 Auto(String id, String driver){
     super(id, driver, 10);
 }

 public double calculateFare(double distance){
     return distance * ratePerKm + 20; 
 }

 public String getCurrentLocation(){
     return location;
 }

 public void updateLocation(String location){
     this.location = location;
 }
}
