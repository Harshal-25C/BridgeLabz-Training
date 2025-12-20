//Imported java util package to access scanner class
import java.util.*;

public class SumOfNaturalNumbers{
    //Initialize a method findSumOfNaturalNumbers
    public int findSumOfNaturalNumbers(int number){
	    
		//Initialize sum for storing natural number's sum
		int sum = 0;
		//check if number is natural or not
		if(number > 0){
		    for(int i=1; i<=number; i++){
		        sum += i;
		    }
		}
		
		//returning the sum of natural numbers
		return sum;
	}
    public static void main(String[] args){
		//Initialize Scanner 
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Create an object of class SumOfNaturalNumbers
		SumOfNaturalNumbers snn = new SumOfNaturalNumbers();
		
		//Access the method findSumOfNaturalNumbers through object snn
		int naturalNum = snn.findSumOfNaturalNumbers(number);
		
		System.out.println("Sum of natural number till " +number+ " is: "+ naturalNum);
	}
}