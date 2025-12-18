//Import java util package for Scanner
import java.util.*;

public class FizzBuzzUsingWhile{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Check if the number is positive or not
		if(number > 0){
		    //Uses while loop to interate from 1 to number and checking 'Fizz' Or 'Buzz' Or 'FizzBuzz'
			int i=1;
		    while(i<=number){
			    if(i%3 == 0){
				    System.out.println("Fizz");
				}else if(i%5 == 0){
				    System.out.println("Buzz");
				}
				if((i%3 == 0) && (i%5 == 0)){
				    System.out.println("FizzBuzz");
				}else{
				    System.out.println(i);
				}
				i++;
			}
		}
	}
}