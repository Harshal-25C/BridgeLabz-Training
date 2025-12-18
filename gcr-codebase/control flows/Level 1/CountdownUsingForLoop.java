//Import java util package for Scanner
import java.util.*;

public class CountdownUsingForLoop{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize counter as an user input
		System.out.println("Enter the counter: ");
		int counter = sc.nextInt();
		
		//Check if the counter is 1 or less than 1
		if(counter <= 1){
		    System.out.println("Please Enter Correct Value!");
		}
		
		//Use for loop for countdown and decrementing counter by 1
		for(int i=counter; i>=2; i--){
		    counter--;
			System.out.println(counter);
		}
	}
}