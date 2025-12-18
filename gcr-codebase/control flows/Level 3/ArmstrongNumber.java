//Import java util package for Scanner
import java.util.*;

public class ArmstrongNumber{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Initialize number as user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp=number;
        int sum=0;

        //Iterate while loop since temp is equal to zero
        while (temp != 0) {
            //Find remainder(last digit)
            int digit = temp%10;

            //Find cube of digit and add to sum
            sum = sum +(digit*digit*digit);

            temp/= 10;
        }

        //Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is Not an Armstrong Number");
        }
    }
}
