//Import java util package for Scanner
import java.util.*;

public class MultiplesBelowHundred{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
		Scanner sc = new Scanner(System.in);

        //Take number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Check if the number is positive and less than 100
        if(number > 0 && number < 100) {

            for (int i = 100; i >= 1; i--) {
			    //Check if i is a multiple of the given number
                if (i%number== 0) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Please enter a positive number which is less than 100.");
        }
    }
}
