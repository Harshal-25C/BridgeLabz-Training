//import java util package to access Scanner class
import java.util.*;

public class NumberChecker3{
    //This method counts how many digits are present in the number
    public static int countDigits(int number){
        int count = 0;
        while (number!=0){
            count++;
            number/=10;
        }
        return count;
    }

    //This method stores each digit of the number into an array
    public static int[] storeDigits(int number){
        int size = countDigits(number);
        int[] digits = new int[size];

        for(int i=size-1; i>=0; i--){
            digits[i] = number%10;
            number/=10;
        }
        return digits;
    }

    //This method reverses the digits array
    public static int[] reverseArray(int[] digits){
        int[] reversed = new int[digits.length];

        for(int i=0; i<digits.length; i++){
            reversed[i] = digits[digits.length-1-i];
        }
        return reversed;
    }

    //This method compares two arrays and checks if they are equal
    public static boolean compareArrays(int[] a, int[] b){
        if(a.length!=b.length)
            return false;

        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;}
        }
        return true;
    }

    //This method checks whether the number is a palindrome
    public static boolean isPalindrome(int[] digits){
        int[] reversed=reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // This method checks whether the number is a duck number
    public static boolean isDuckNumber(int[] digits){
        for(int d :digits){
            if (d!=0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
	//Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Palindrome Number: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));

    }
}
