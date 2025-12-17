import java.util.*;

public class BasicCalculator{
    public static void main(String[] args){
	    //Initialize Scanner class for taking user inputs
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number 1 and number 2 and take input of them
		System.out.println("Enter 1st number: ");
        int number_1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int number_2 = sc.nextInt();
		
		//Performs addition(+), subtraction(-), multiplication(*) & division(/) operators
		int addition = number_1+number_2;
		int subtraction = number_1-number_2;
		int multiplication = number_1*number_2;
		int division = number_1/number_2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number_1+" and "+number_2+" is "+ addition+"," +subtraction+", "+ multiplication +", and "+division);
    }
}