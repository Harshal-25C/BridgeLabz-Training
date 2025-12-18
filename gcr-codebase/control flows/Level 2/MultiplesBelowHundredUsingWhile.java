//Import java util package for Scanner
import java.util.*;

public class MultiplesBelowHundredUsingWhile{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
		Scanner sc = new Scanner(System.in);

        //Take number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Check if the number is positive and less than 100
        if(number > 0 && number < 100) {
            int counter = 100;

            // Loop until counter becomes 1
            while (counter>=1) {

                //Check if counter is a multiple of the number
                if (counter%number ==0) {
                    System.out.println(counter);
                }
                counter--;
			}
        }else{
            System.out.println("Please enter a positive number which is less than 100.");
        }
    }
}