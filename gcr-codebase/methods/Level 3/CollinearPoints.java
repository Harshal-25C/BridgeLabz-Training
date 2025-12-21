//import java util package to access Scanner class
import java.util.*;

public class CollinearPoints{
    //This method checks collinearity using the slope formula
    public static boolean checkUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3){

        // Calculate slopes between points
        double slopeAB = (double) (y2 - y1)/(x2 - x1);
        double slopeBC = (double) (y3 - y2)/(x3 - x2);
        double slopeAC = (double) (y3 - y1)/(x3 - x1);

        //If all slopes are equal, points are collinear
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    //This method checks collinearity using the area of triangle formula
    public static boolean checkUsingArea(int x1, int y1, int x2, int y2, int x3, int y3){

        //Formula for area of triangle formed by three points
        double area = 0.5*(x1*(y2 - y3)+ x2*(y3 - y1) + x3*(y1 - y2));

        //If area is zero, points are collinear
        return area == 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Take coordinates of three points from user
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        //Check collinearity using both methods
        System.out.println("Collinear using Slope Method: " +
                checkUsingSlope(x1, y1, x2, y2, x3, y3));

        System.out.println("Collinear using Area Method: " +
                checkUsingArea(x1, y1, x2, y2, x3, y3));
    }
}
