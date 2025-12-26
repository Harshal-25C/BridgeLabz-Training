//Import java util package for Scanner
import java.util.*;

public class AbundantNumber{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        //Find sum of divisors
        for(int i=1; i<number; i++) {
            if (number%i == 0) {
                sum += i;
            }
        }

        //Check Abundant condition
		// An Abundant Number is a number where the sum of its proper divisors is greater than the number itself.
		// Example: 12 → Divisors: 1, 2, 3, 4, 6
		// Sum = 16 > 12
		
        if(sum > number){
            System.out.println("Abundant Number");
        }else{
            System.out.println("Not an Abundant Number");
        }

    }
}
