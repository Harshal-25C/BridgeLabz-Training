//Import java util package for Scanner
import java.util.*;

public class AgeForVoting{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize age as a user input
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		//Check if age is greater than or equal to 18 or not using if-else statement
		if(age >= 18){
			System.out.println("The person's age is "+age+" and can vote.");
		}else{
		    System.out.println("The person's age is "+age+" and cannot vote.");
		}
	}
}