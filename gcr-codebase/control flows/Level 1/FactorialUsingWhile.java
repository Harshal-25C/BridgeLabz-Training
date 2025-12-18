//Import java util package for Scanner
import java.util.*;

public class FactorialUsingWhile{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Initialize fact for storing factorial values
		int fact=1;
		
		//Use while loop for decreasing number and multiply values with fact 
		int temp=number;
		while(temp != 0){
		    fact *= temp;
			temp--;
		}
		
		System.out.println("Factorial of "+number+" is "+ fact);
	}
}