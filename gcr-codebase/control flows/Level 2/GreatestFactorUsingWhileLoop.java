//Import java util package for Scanner
import java.util.*;

public class GreatestFactorUsingWhileLoop{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
		Scanner sc = new Scanner(System.in);
		
        //Take the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Initially set greatest factor as 1
        int greatest_factor = 1;

        //Loop from number-1 down to 1 to find the greatest factor
		int i=number-1;
        while(i >=1) {
            // Check if the number is perfectly divisible by i
            if (number%i== 0) {
                greatest_factor = i;
				//Stop the loop using break statement
                break; 
            }
			i--;
        }

        System.out.println("Greatest factor : " + greatest_factor);
    }
}