//Imported java util package to access Scanner class
import java.util.*;

public class QuotientAndReminder{
    //Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
	    //Use division operator (/) for quotient and moduli operator (%) for reminder
        int quotient = number/divisor;
        int remainder = number%divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number and divisor:");
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        //Access the method findRemainderAndQuotient 
        int[] result2 = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result2[0]);
        System.out.println("Remainder: " + result2[1]);

    }
}