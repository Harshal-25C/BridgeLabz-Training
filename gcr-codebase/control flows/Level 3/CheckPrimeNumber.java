//Import java util package for Scanner
import java.util.*;

public class CheckPrimeNumber{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Prime numbers are greater than 1
        if(number <= 1){
            isPrime = false;
        }else{
            //Check divisibility from 2 to num - 1
            for (int i=2; i<number; i++) {
                if (number%i == 0) {
                    isPrime = false;
					//number is divisible, not prime
                    break;
                }
            }
        }

        //check if number is prime or not using isPrime and if-else statement
        if(isPrime){
            System.out.println(number+" is a Prime Number");
        }else{
            System.out.println(number+" is Not a Prime Number");
        }
    }
}
