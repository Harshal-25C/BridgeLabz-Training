//Import java util package to access Scanner
import java.util.*;

public class BMICalculation2D{
    public static void main(String[] args){

        //Initialize Scanner
        Scanner sc = new Scanner(System.in);

        //take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        //Initialize 2-D array
        double[][] personData = new double[number][3];

        //array to store weight status
        String[] weightStatus = new String[number];

        //take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            //take weight input (must be positive)
            do{
                System.out.print("Enter weight in kg: ");
                personData[i][0] = sc.nextDouble();
                if(personData[i][0] <= 0){
                    System.out.println("Weight must be positive. Please re-enter.");
                }
            }while (personData[i][0] <= 0);

            //Take height input (must be positive)
            do{
                System.out.print("Enter height in meters: ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please re-enter.");
                }
            }while (personData[i][1] <= 0);
        }

        //Calculate BMI and determine weight status
        for (int i=0; i<number; i++) {

            //BMI formula
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            //Determine weight status
            if(personData[i][2] <= 18.4){
                weightStatus[i] = "Underweight";
            }else if(personData[i][2] <= 24.9){
                weightStatus[i] = "Normal";
            }else if(personData[i][2] <= 39.9){
                weightStatus[i] = "Overweight";
            }else{
                weightStatus[i] = "Obese";
            }
        }

        //Display BMI Report
        System.out.println("BMI REPORT");
        for (int i=0; i<number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

    }
}
