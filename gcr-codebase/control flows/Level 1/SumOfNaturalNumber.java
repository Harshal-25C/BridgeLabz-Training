//Import java util package for Scanner
import java.util.*;

public class SumOfNaturalNumber{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Check if number is natural or not and prints the sum of natural number
		if(number > 0){
		    int sum_of_natural = number * (number+1)/2;
			System.out.println("The sum of "+number+" natural numbers is "+sum_of_natural);
		}else{
		    System.out.println("The number "+number+" is not a natural number");
		}
	}
}