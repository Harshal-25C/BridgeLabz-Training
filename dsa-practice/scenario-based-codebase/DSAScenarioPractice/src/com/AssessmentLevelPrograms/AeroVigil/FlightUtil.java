package com.AssessmentLevelPrograms.AeroVigil;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		String regex = "^FL-[1-9][0-9]{3}$";
		
		if(!flightNumber.matches(regex)) {
			throw new InvalidFlightException(
					"The flight number "+flightNumber+" is invalid"
			);
		}
		return true;
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException {
		
		if(!(flightName.equals("SpiceJet") || flightName.equals("Vistara") || flightName.equals("IndiGo") ||
	              flightName.equals("Air Arabia"))){
				throw new InvalidFlightException(
						"The flight name "+flightName+" is invalid"
				);
		}
		return true;
	}
	
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
		
		int maxCapacity = 0;

        switch (flightName) {
            case "SpiceJet":
                maxCapacity = 396;
                break;
            case "Vistara":
                maxCapacity = 615;
                break;
            case "IndiGo":
                maxCapacity = 230;
                break;
            case "Air Arabia":
                maxCapacity = 130;
                break;
        }

        if(passengerCount <= 0 || passengerCount > maxCapacity) {
            throw new InvalidFlightException(
                    "The passenger count " + passengerCount +
                    " is invalid for " + flightName
            );
        }

        return true;
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		double maxFuel = 0;

        switch (flightName) {
            case "SpiceJet":
                maxFuel = 200000;
                break;
            case "Vistara":
                maxFuel = 300000;
                break;
            case "IndiGo":
                maxFuel = 250000;
                break;
            case "Air Arabia":
                maxFuel = 150000;
                break;
        }

        if(currentFuelLevel < 0 || currentFuelLevel > maxFuel) {
            throw new InvalidFlightException(
                    "Invalid fuel level for " + flightName
            );
        }

        return maxFuel-currentFuelLevel;
	}
}
