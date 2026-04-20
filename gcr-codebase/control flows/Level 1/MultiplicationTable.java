//Import java util package for Scanner
import java.util.*;

public class MultiplicationTable{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Print the multiplication table for the given number from 6 to 9
        System.out.println("Multiplication table for " + number + " (from 6 to 9):");
        
        //Use a for loop to iterate from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Calculate the product
            int product = number*i;
			
            System.out.println(number+" * " +i+" = "+product);
        }
	}
}