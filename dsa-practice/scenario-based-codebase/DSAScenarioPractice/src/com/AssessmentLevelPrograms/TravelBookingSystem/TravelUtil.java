package com.AssessmentLevelPrograms.TravelBookingSystem;

public class TravelUtil {
	
	double basePrice=0;
	double discount = 0;
	double seasonalCharge=0;
	
	public void ValidPackages(String packageName) {
		
		if(!(packageName.equals("P123") || packageName.equals("P223") 
				|| packageName.equals("P345"))) {
			System.out.println("Invalid Package Name");
			System.exit(0);
		}else {
			switch(packageName) {
			    case "P123":
			    	basePrice = 5000;
			    	discount = basePrice * 0.10;
			    	break;
			    case "P223":
			    	basePrice = 10000;
			    	discount = basePrice * 0.10; 
			    	break;
			    case "P345":
			    	basePrice = 12000;
			    	discount = basePrice * 0.10;
			    	break;
			    	
			    default:
			    	System.out.println("Invalid Package Name");
			    	break;
			}
		}
		
	}
	
	public void ValidSeason(String season) {
		if(!(season.equals("season") || season.equals("peakseason") 
				|| season.equals("offseason"))) {
			System.out.println("Invalid Season");
			System.exit(0);
		}else {
			switch(season) {
			    case "season":
			    	seasonalCharge = basePrice*0.15;
			    	break;
			    case "peakseason":
			    	seasonalCharge = basePrice*0.25;
			    	break;
			    case "offseason":
			    	seasonalCharge = basePrice*0.10;
			    	break;
			}
		}
	}
	
	public void ValidNumberOfDays(int numberOfDays) {
		if(numberOfDays < 0) {
			System.out.println("Number Of Days Is Not Positive");
			System.exit(0);
		}
	}
	
	public double calculatePrice(String customerName, String packageName, int numberOfDays, String season){
		double finalPrice=0;
		if(numberOfDays >= 7) {
			finalPrice = (basePrice - discount) + seasonalCharge;
		}else {
			finalPrice = basePrice+seasonalCharge;
		}
		return finalPrice;
	}
}

//Or This is a good practice 
/*

public class TravelUtil {

    public double calculatePrice(String packageName, int numberOfDays, String season) {

        double basePrice;

        switch (packageName) {
            case "P123":
                basePrice = 5000;
                break;
            case "P223":
                basePrice = 10000;
                break;
            case "P345":
                basePrice = 12000;
                break;
            default:
                throw new IllegalArgumentException("Invalid Package Name");
        }

        if (numberOfDays <= 0) {
            throw new IllegalArgumentException("Number of days must be positive");
        }

        double seasonalCharge;

        switch (season) {
            case "season":
                seasonalCharge = basePrice * 0.15;
                break;
            case "peakseason":
                seasonalCharge = basePrice * 0.25;
                break;
            case "offseason":
                seasonalCharge = basePrice * 0.10;
                break;
            default:
                throw new IllegalArgumentException("Invalid Season");
        }

        double discount = 0;

        if (numberOfDays >= 7) {
            discount = basePrice * 0.10;
        }

        return (basePrice - discount) + seasonalCharge;
    }
}

*/
