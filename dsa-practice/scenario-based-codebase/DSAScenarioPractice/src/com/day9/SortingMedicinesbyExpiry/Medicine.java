package com.day9.SortingMedicinesbyExpiry;

public class Medicine {
	String medicineName;
	int expiryDate;
	
	Medicine(String medicineName, int expiryDate){
		this.medicineName = medicineName;
		this.expiryDate = expiryDate;
	}
	
	public String toString() {
		return "Medicine : "+medicineName+" Expiry Date: "+expiryDate;
	}

}
