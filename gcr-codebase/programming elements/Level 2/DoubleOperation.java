import java.util.*;

public class DoubleOperation{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		//Take three inputs as Double
        System.out.println("Enter 1st Double value: ");
        double a = sc.nextDouble();

        System.out.println("Enter 2nd Double value: ");
        double b = sc.nextDouble();

        System.out.println("Enter 3rd Double value: ");
        double c = sc.nextDouble();

        //Compute 3 double operations and assign the result to a variable
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        //Print the results of the double operations
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}