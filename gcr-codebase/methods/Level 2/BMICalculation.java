//Import java util package to access Scanner class
import java.util.*;

public class BMICalculation{
    // Method to calculate BMI and populate the 3rd column of array
    public static void calculateBMI(double[][] data){
        for(int i=0; i<data.length; i++){
            double weight = data[i][0];
            double heightCm = data[i][1];

            //Convert height from cm to meters
            double heightMeter = heightCm / 100;

            //BMI formula
            double bmi = weight/(heightMeter*heightMeter);
            data[i][2] = bmi;
        }
    }

    //Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data){
        String[] status = new String[data.length];

        for (int i=0; i<data.length; i++){
            double bmi = data[i][2];

            if(bmi <= 18.4){
                status[i] = "Underweight";
            }else if(bmi >= 18.5 && bmi <= 24.9){
                status[i] = "Normal";
            }else if (bmi >= 25.0 && bmi <= 39.9){
                status[i] = "Overweight";
            }else{
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args){
        //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        //2D array: weight, height(cm), BMI
        double[][] persons = new double[10][3];

        for(int i=0; i<10; i++){
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        //get BMI status
        String[] bmiStatus = determineBMIStatus(persons);

        for (int i = 0; i < 10; i++) {
        System.out.println(
        (i + 1) + "\t" +
        persons[i][0] + "\t" +
        persons[i][1] + "\t" +
        persons[i][2] + "\t" +
        bmiStatus[i]
        );
        }

    }
}
