//Import java util package for Scanner
import java.util.*;

public class FactorialUsingFor{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Initialize fact for storing factorial values
		int fact=1;
		
		//Use for loop for decreasing number and multiply values with fact 
		int temp=number;
		for(int i=temp; i>=1; i--){
		    fact *= i;
		}
		
		System.out.println("Factorial of "+number+" is "+ fact);
	}
}