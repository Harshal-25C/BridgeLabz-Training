//Import java util package for Scanner
import java.util.*;

public class SumOfNumbersUntilNegative{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Intialize total for storing numbers
		double total = 0.0;
		
		//Initialize nummber as an user input
		System.out.println("Enter any number ");
		double number = sc.nextDouble();
		
		
		//Use while loop for checking number is 0 and negative or not and it runs until the user doesn't enter 0 or any negative value
		while((number != 0) || (number > 0)){
			total += number;
			System.out.println("Again Enter any number ");
		    number = sc.nextDouble();
			//Check if number is 0 or negative than break the loop
			if((number == 0) || (number < 0)){
			    break;
			}
		}
		
		//prints the sum of numbers
		System.out.println(total);
	}
}