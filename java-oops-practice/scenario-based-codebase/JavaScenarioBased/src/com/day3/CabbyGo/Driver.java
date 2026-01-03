package com.day3.CabbyGo;

class Driver {
	 private String name;
	 private String licenseNumber;
	 private double rating; //Sensitive data

	 Driver(String name, String licenseNumber, double rating){
	     this.name = name;
	     this.licenseNumber = licenseNumber;
	     this.rating = rating;
	 }

	 public String getDriverInfo() {
	     return name + " (Rating: " + rating + ")";
	 }
	}
