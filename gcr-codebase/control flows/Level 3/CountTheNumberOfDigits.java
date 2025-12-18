//Import java util package for Scanner
import java.util.*;

public class CountTheNumberOfDigits{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Initialize number as user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Intitalize count for counting digits with zero
        int count = 0;
		
		int temp = number;
        while(temp != 0){
		    temp /= 10;
			count++;
		}
		
		System.out.println("Number of Digits in " +number+ " are: " +count);
    }
}