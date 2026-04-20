//Import java util package to access Scanner class
import java.util.*;

public class TrigonometricFunctions{
    //Method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle){

        //Convert degrees to radians
        double radians = Math.toRadians(angle);

        double[] result = new double[3];
        result[0] = Math.sin(radians); //Sine
        result[1] = Math.cos(radians); //Cosine
        result[2] = Math.tan(radians); //Tangent

        return result;
    }

    public static void main(String[] args){
        //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        //Take angle input in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        //Call method
        double[] values = calculateTrigonometricFunctions(angle);

        //Display results
        System.out.println("Sine of angle: " + values[0]);
        System.out.println("Cosine of angle: " + values[1]);
        System.out.println("Tangent of angle: " + values[2]);
    }
}
