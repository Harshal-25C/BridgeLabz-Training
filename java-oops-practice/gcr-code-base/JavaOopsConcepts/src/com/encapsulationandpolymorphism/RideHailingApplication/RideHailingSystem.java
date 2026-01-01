package com.encapsulationandpolymorphism.RideHailingApplication;
import java.util.*;

public class RideHailingSystem{
 public static void main(String[] args){

     List<Vehicle> rides = new ArrayList<>();

     rides.add(new Car("CAR101", "Amit"));
     rides.add(new Bike("BIKE202", "Ravi"));
     rides.add(new Auto("AUTO303", "Suresh"));

     double distance = 12.5;

     for(Vehicle v:rides){
         v.getVehicleDetails();
         System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));

         GPS gps = (GPS) v;
         gps.updateLocation("City Center");
         System.out.println("Current Location: " + gps.getCurrentLocation());
         System.out.println("---------------------------");
     }
 }
}
