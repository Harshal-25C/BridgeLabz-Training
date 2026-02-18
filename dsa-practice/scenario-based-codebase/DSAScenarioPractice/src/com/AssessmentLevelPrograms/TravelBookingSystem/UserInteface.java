package com.AssessmentLevelPrograms.TravelBookingSystem;
import java.util.*;

public class UserInteface {
	public static void main(String[] args) {
		TravelUtil tu = new TravelUtil();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter booking details like(customerName:packageName:numberOfDays:season): ");
		String input = sc.nextLine();
		
		String[] parts = input.split(":");
		
		String customerName = parts[0];
		String packageName = parts[1];
		int numberOfDays = Integer.parseInt(parts[2]);
		String season = parts[3];
		
		tu.ValidPackages(packageName);
		tu.ValidSeason(season);
		tu.ValidNumberOfDays(numberOfDays);
		double finalPrice = tu.calculatePrice(customerName, packageName, numberOfDays, season);
		System.out.println("The total booking price for the customer is: "+finalPrice);
	}
}
