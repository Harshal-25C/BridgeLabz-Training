//Imported java util package to access scanner class
import java.util.*;

public class TriangularPark{
    //Initialize a method 
    public double perimeterOfTriangle(double side1, double side2, double side3){
	    //The perimeter of a triangle is the addition of all sides
	    double additionOfThreeSides = side1+side2+side3;
		
		double round = additionOfThreeSides/5;
		
		//return value as a round
		return round;
	}
    public static void main(String[] args){
		//Initialize Scanner 
	    Scanner sc = new Scanner(System.in);
		
		//Initialize three sides of triangle
		System.out.println("Enter 1st side: ");
		double side1 = sc.nextDouble();
		System.out.println("Enter 2nd side: ");
		double side2 = sc.nextDouble();
		System.out.println("Enter 3rd side: ");
		double side3 = sc.nextDouble();
		
		//Create an object of class TriangularPark
		TriangularPark tp = new TriangularPark();
		
		//Access the method perimeterOfTriangle through object tp
		double numberOfRounds = tp.perimeterOfTriangle(side1, side2, side3);
		
		System.out.println("The number of rounds user needs :"+ numberOfRounds);
	}
}