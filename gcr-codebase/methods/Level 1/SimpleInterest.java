//Imported java util package to access scanner class
import java.util.*;

public class SimpleInterest{
    //Initialize a method simpleInterest
    public double simpleInterest(double principal, double rate, double time){
	    //Use formula Simple Interest = Principal * Rate * Time / 100
	    double simpInterest = (principal*rate*time)/100;
		
		//return value as a simpInterest
		return simpInterest;
	}
    public static void main(String[] args){
		//Initialize Scanner 
	    Scanner sc = new Scanner(System.in);
		
		//Initialize three doubles as a input
		System.out.println("Enter the principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the time: ");
		double time = sc.nextDouble();
		
		//Create an object of class SimpleInterest
		SimpleInterest si = new SimpleInterest();
		
		//Access the method simpleInterest through object si
		double simpleInt = si.simpleInterest(principal, rate, time);
		
		System.out.println("Simple Interest is: "+ simpleInt);
	}
}