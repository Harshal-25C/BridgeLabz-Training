//Import java util package for Scanner
import java.util.*;

public class PowerOfNumber{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
		Scanner sc = new Scanner(System.in);

        //Take number and power as input from user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        //Initialize result variable
        int result = 1;

        // Check for positive values
        if (number > 0 && power >= 0) {

            for (int i=1; i<=power; i++) {
                result = result*number;
            }
            System.out.println("Result: "+result);

        }else{
            System.out.println("Please enter positive values only.");
        }
    }
}
