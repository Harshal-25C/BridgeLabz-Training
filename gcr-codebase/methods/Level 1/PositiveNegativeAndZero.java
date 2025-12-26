//Imported java util package to access scanner class
import java.util.*;

public class PositiveNegativeAndZero{
    //Initialize a method checkPositiveNegativeOrZero
    public int checkPositiveNegativeOrZero(int number){
	    //Check is the number is Positive
		if(number > 0){
		    return 1; 
		}
		//Check is the number is Zero
		if(number == 0){
		    return 0; 
		}
		//Or the number is Negative
		return -1;
	}
	
    public static void main(String[] args){
		//Initialize Scanner 
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Create an object of class PositiveNegativeAndZero
		PositiveNegativeAndZero PNZ = new PositiveNegativeAndZero();
		
		//Access the method checkPositiveNegativeOrZero through object PNZ
		int checkNumber = PNZ.checkPositiveNegativeOrZero(number);
		
		if(checkNumber > 0){
		    System.out.println("The Number is Positive!");
		}else if(checkNumber < 0){
		    System.out.println("The Number is Negative!");
		}else{
		    System.out.println("The Number is Zero!");
		}
	}
}