//Imported java util package to access Scanner
import java.util.*;

public class BMICalculation{
    public static void main(String[] args){
        //Initialize Scanner 
        Scanner sc = new Scanner(System.in);

        //Initialize number as a user input
        System.out.print("Enter number of persons ");
        int num = sc.nextInt();

        double[] weight = new double[num];
        double[] height = new double[num];
        double[] bmi = new double[num];
        String[] status = new String[num];

        //take input for weight and height
        for (int i=0; i<num; i++){
            System.out.println("Enter details for Person "+(i+1));

            System.out.print("Enter weight in kg ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
        }

        //Calculate BMI and determine status
        for(int i=0; i<num; i++){
            //Use BMI formula 
            bmi[i] = weight[i]/(height[i] * height[i]);

            if(bmi[i] <= 18.4){
                status[i] = "Underweight";
            }else if(bmi[i] <= 24.9){
                status[i] = "Normal";
            }else if(bmi[i] <= 39.9){
                status[i] = "Overweight";
            }else{
                status[i] = "Obese";
            }
        }
        System.out.println("BMI REPORT");
        for (int i=0; i<num; i++) 
           { System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI" + bmi[i]);
            System.out.println("Status " + status[i]);
            System.out.println(" ");
        }

    }
}