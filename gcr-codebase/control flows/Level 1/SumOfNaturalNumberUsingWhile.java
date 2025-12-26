//Import java util package for Scanner
import java.util.*;

public class SumOfNaturalNumberUsingWhile{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Intialize total for store the sum of natural numbers
		int total=0;
		
		//Check if number is natural or not and prints the sum of natural number
		if(number > 0){
		    int sum_of_natural = number * (number+1)/2;
			while(number != 0){
			    total += number;
				number--;
			}
			
			if(sum_of_natural == total){
			    System.out.println("The sum of natural number is "+total);
			}
		}else{
		    System.out.println("This is not the a natural number please enter correct!");
		}
		
	}
}