//Import java util package to access Scanner Class
import java.util.*;

public class BMICalculator{
    //Method to calculate BMI and status for one person
    public static String[] calculateBMI(double weight, double heightCm){
        //Convert height from cm to meters
        double heightMeter = heightCm / 100;

        double bmi = weight/(heightMeter*heightMeter);

        //Round BMI to 2 decimal places
        bmi = Math.round(bmi*100.0)/100.0;

        String status;
        if(bmi<18.5){
            status = "Underweight";
        }else if(bmi<25){
            status = "Normal";
        }else if(bmi<30){
            status = "Overweight";
        }else{
            status = "Obese";
        }

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.valueOf(bmi),
                status
        };
    }

    //Method to compute BMI details for all persons
    public static String[][] computeAllBMI(double[][] hwData){

        String[][] result = new String[hwData.length][4];

        for(int i=0; i<hwData.length; i++){
            result[i] = calculateBMI(hwData[i][0], hwData[i][1]);
        }
        return result;
    }

    //Method to display BMI details in tabular format
    public static void displayTable(String[][] data){
        System.out.println("\nBMI Report");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("--------------------------------------------------------------");

        for(int i=0; i<data.length; i++){
            System.out.println(
                    (i + 1) + "\t" +
                    data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t\t" +
                    data[i][3]
            );
        }
    }

    public static void main(String[] args){
        //Intialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //2D array to store weight and height
        double[][] hwData = new double[10][2];

        for(int i=0; i<10; i++){
            System.out.println("\nEnter details for Person " +(i+1));
            System.out.print("Weight (kg): ");
            hwData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            hwData[i][1] = sc.nextDouble();
        }

        String[][] bmiResult = computeAllBMI(hwData);
        displayTable(bmiResult);
    }
}
