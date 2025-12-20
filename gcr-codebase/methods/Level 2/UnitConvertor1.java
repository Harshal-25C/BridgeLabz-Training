//Import java util package to access Scanner
import java.util.*;

public class UnitConvertor1{
    //Kilometers to Miles
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        return km * km2miles;
    }

    //Miles to Kilometers
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    //Meters to Feet
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    //Feet to Meters
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    
	public static void main(String[] args) {
        //Initialize Scanner class for taking user inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));

    }
}
