//import java util package to access Scanner class
import java.util.*;

public class DistanceAndLineEquation{
    //This method calculates the Euclidean distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1,2));
    }

    //This method calculates slope (m) and y-intercept (b) of a line
    public static double[] lineEquation(int x1, int y1, int x2, int y2){
        double m = (double) (y2 - y1) / (x2 - x1);   // slope formula
        double b = y1 - m * x1;                     // y-intercept formula
        return new double[]{m, b};
    }

    public static void main(String[] args){
	    //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        // Take input coordinates from the user
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        //Calculate and display Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: "+distance);

        //Calculate and display equation of line
        double[] result = lineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + result[0] + "x + " + result[1]);
    }
}
