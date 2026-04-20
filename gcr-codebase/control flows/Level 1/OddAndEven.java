//Import java util package for Scanner
import java.util.*;

public class OddAndEven{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Use for loop to interate from 1 to user entered value
		for(int i=1; i<=number; i++){
		    //Check is number is odd or even using % operator
		    if(i%2 == 0){
			    System.out.println("Number "+i+" is Even");
			}else{
			    System.out.println("Number "+i+" is Odd");
			}
		}
	}
}