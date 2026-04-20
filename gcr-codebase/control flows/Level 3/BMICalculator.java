//Import java util package for Scanner
import java.util.*;

public class BMICalculator{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Intialize weight and height as a user input
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();
		
        //Convert height from cm to meters
        double heightMeter=height/100;

        //Calculate BMI
        double bmi = weight/(heightMeter*heightMeter);

        String status;

        // Determine BMI status
        if(bmi<=18.4) {
            status ="Underweight";
        }else if(bmi <= 24.9) {
            status = "Normal";
        }else if(bmi <= 39.9) {
            status = "Overweight";
        }else{
            status = "Obese";
        }

        System.out.println("\n--- BMI Result ---");
        System.out.println("BMI: "+ bmi);
        System.out.println("Status: " + status);

    }
}
