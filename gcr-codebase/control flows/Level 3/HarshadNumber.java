//Import java util package for Scanner
import java.util.*;

public class HarshadNumber{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        //Calculate sum of digits
        while(temp > 0){
            sum = sum + (temp%10);
            temp /= 10;
        }

        // Check Harshad condition
		// A Harshad Number is a number divisible by the sum of its digits.
		//Example : 21 → 2 + 1 = 3 → 21 ÷ 3 = 7
		
        if(number%sum == 0){
            System.out.println(number+" is a Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
}
