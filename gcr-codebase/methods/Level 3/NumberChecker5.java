//import java util package to access Scanner class
import java.util.*;

public class NumberChecker5{
    //This method calculates the sum of proper divisors of a number
    public static int sumOfProperDivisors(int number){
        int sum = 0;

        for(int i=1; i<=number/2; i++){
            if(number%i == 0){
                sum += i;
            }
        }
        return sum;
    }

    //This method checks whether the number is a perfect number
    public static boolean isPerfect(int number){
        return sumOfProperDivisors(number) ==number;
    }

    //This method checks whether the number is an abundant number
    public static boolean isAbundant(int number){
        return sumOfProperDivisors(number) > number;
    }

    //This method checks whether the number is a deficient number
    public static boolean isDeficient(int number){
        return sumOfProperDivisors(number)<number;
    }

    //This method finds factorial of a digit
    public static int factorial(int digit){
        int fact=1;
        for (int i=1; i<=digit; i++){
            fact*=i;
        }
        return fact;
    }

    //This method checks whether the number is a strong number
    public static boolean isStrong(int number){
        int temp=number;
        int sum=0;

        while(temp!=0){
            int digit = temp%10;
            sum+=factorial(digit);
            temp/=10;
        }
        return sum==number;
    }

    public static void main(String[] args){
	    //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
    }
}
