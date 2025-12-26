import java.util.Scanner;

public class BMIFitnessTracker{

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Ask user to enter height in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = sc.nextDouble();

        //Ask user to enter weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = sc.nextDouble();

        //Calculate BMI using the formula
        //BMI = weight/(height*height)
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        //Display the calculated BMI
        System.out.println("\nYour BMI is: " + bmi);

        //Check BMI category using if-else
        if(bmi < 18.5){
            System.out.println("BMI Category: Underweight");
        }else if(bmi >=18.5 && bmi < 25){
            System.out.println("BMI Category: Normal");
        }else{
            System.out.println("BMI Category: Overweight");
        }

    }
}
