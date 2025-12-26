//Import java util package for Scanner
import java.util.*;

public class DivisibleByFive{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Check if number is divisible by 5 print either Yes Or No
		if(number%5 == 0){
		    System.out.println("Is the number "+ number+" divisible by 5? Yes");
		}else{
		    System.out.println("Is the number "+ number+" divisible by 5? No");
		}
	}
}