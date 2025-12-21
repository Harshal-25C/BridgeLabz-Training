//import java util package to access Scanner class
import java.util.*;

public class NumberChecker4{
    // This method checks whether a number is prime
    public static boolean isPrime(int number){
        if(number<=1)
            return false;

        for(int i=2; i<=number/2; i++){
            if (number%i == 0)
                return false;
        }
        return true;
    }

    //This method checks whether a number is a neon number
    public static boolean isNeon(int number)
	{
        int square =number*number;
        int sum=0;

        while(square!= 0) {
            sum += square%10;
            square/=10;
        }
        return sum == number;
    }

    //This method checks whether a number is a spy number
    public static boolean isSpy(int number){
        int sum = 0;
        int product = 1;

        while (number != 0){
            int digit = number%10;
            sum+=digit;
            product *=digit;
            number/=10;
        }
        return sum == product;
    }

    //This method checks whether a number is automorphic
    public static boolean isAutomorphic(int number){
        int square = number*number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    //This method checks whether a number is a buzz number
    public static boolean isBuzz(int number) {
        return (number%7 == 0 || number%10==7);
    }

    public static void main(String[] args){
	    //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeon(number));
        System.out.println("Spy Number: " + isSpy(number));
        System.out.println("Automorphic Number: " + isAutomorphic(number));
        System.out.println("Buzz Number: " + isBuzz(number));
    }
}
