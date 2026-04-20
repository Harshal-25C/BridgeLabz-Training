package com.day3.CabbyGo;

public class RideService implements IRideService{
	 private Vehicle vehicle;
	 private Driver driver;

	 RideService(Vehicle vehicle, Driver driver){
	     this.vehicle = vehicle;
	     this.driver = driver;
	 }

	 //Book a ride
	 public void bookRide(double distance){
	     vehicle.calculateFare(distance);
	     System.out.println("Ride booked with " + vehicle.type);
	     System.out.println("Driver: " + driver.getDriverInfo());
	     System.out.println("Fare: ₹" + vehicle.getFare());
	 }

	 //End ride
	 public void endRide() {
	     System.out.println("Ride ended successfully.");
	 }
}
