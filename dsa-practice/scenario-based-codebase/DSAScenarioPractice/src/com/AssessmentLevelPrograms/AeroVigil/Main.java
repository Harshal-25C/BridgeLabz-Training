package com.AssessmentLevelPrograms.AeroVigil;
import java.util.*;

public class Main {
	public static void main(String[] args) throws InvalidFlightException {
		Scanner sc = new Scanner(System.in);
		FlightUtil flt = new FlightUtil();
		
		try {
			
		    System.out.println("Enter flight details: ");
		    String flightDetails = sc.nextLine(); //Take input like, FL-100:Vistara:200:100000
		
		    String[] parts = flightDetails.split(":"); //Spliting on the basis of :
		
		    String flightNumber = parts[0];
		    String flightName = parts[1];
		    int passengerCount = Integer.parseInt(parts[2]);
		    double currentFuelLevel = Double.parseDouble(parts[3]);
		    
		    flt.validateFlightName(flightName);
		    flt.validateFlightNumber(flightNumber);
		    flt.validatePassengerCount(passengerCount, flightName);
		
		    double requiredFuel = flt.calculateFuelToFillTank(flightName, currentFuelLevel);
			
			System.out.println("Fuel required to fill the tank: "+requiredFuel);
		}
		catch(InvalidFlightException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
