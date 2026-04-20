//Import java util package for Scanner
import java.util.*;

public class NumberPositiveNegativeOrZero{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Check if the number is Positive, Negative or Zero
		if(number > 0){
			System.out.println("Number is Positive");
		}else if(number < 0){
			System.out.println("Number is Negative");
		}else{
		    System.out.println("Number is Zero");
		}
	}
}