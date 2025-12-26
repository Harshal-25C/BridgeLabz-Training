//import java util package to access Scanner class
import java.util.*;

public class UnitConverter2{
    //Yards to Feet
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards*yards2feet;
    }

    //Feet to Yards
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
        return feet*feet2yards;
    }

    //Meters to Inches
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
        return meters*meters2inches;
    }

    //Inches to Meters
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
        return inches*inches2meters;
    }

    //Inches to Centimeters
    public static double convertInchesToCentimeters(double inches){
        double inches2cm = 2.54;
        return inches*inches2cm;
    }
    
	
	public static void main(String[] args) {
        //Initialize Scanner class for taking user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));

        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));
    }
}