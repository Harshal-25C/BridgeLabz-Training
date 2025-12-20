//Import java util package to access Scanner
import java.util.*;

public class UnitConvertor3{

    //Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32)*5/9;
        return farhenheit2celsius;
    }

    //Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    //Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds){
        double pounds2kilograms = pounds * 0.453592;
        return pounds2kilograms;
    }

    //Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = kilograms * 2.20462;
        return kilograms2pounds;
    }

    //Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters = gallons* 3.78541;
        return gallons2liters;
    }

    //Convert Liters to Gallons
    public static double convertLitersToGallons(double liters){
        double liters2gallons = liters *0.264172;
        return liters2gallons;
    }

    //Main method
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + convertFarhenheitToCelsius(f));

        System.out.print("\nEnter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFarhenheit(c));

        System.out.print("\nEnter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("\nEnter weight in Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kg));

        System.out.print("\nEnter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));

        System.out.print("\nEnter volume in Liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));

    }
}

