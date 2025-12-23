//Import java util package to access Scanner Class
import java.util.*;

public class TemperatureConverter{
    //Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c){
        return (c*9/5) + 32;
    }

    //Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Ask user to choose conversion type
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        //Perform conversion based on user choice
        if(choice == 1){
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(c));
        } 
        else if(choice == 2){
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(f));
        } 
        else{
            System.out.println("Invalid choice");
        }
    }
}
