//Import java util package to access 
import java.util.*;

public class NumberChecker1{
    //Initialize a method countDigits
    public static int countDigits(int number){
        int count = 0;
        while(number != 0){
            count++;
            number/=10;
        }
        return count;
    }

    //Create method for storing digits
    public static int[] storeDigits(int number){
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--){
            digits[i] = number%10;
            number /= 10;
        }
        return digits;
    }

    //Check if the number is duck or not
    public static boolean isDuckNumber(int[] digits){
        for(int d : digits){
            if(d!=0){
                return true;
            }
        }
        return false;
    }

    //Check armstrong number
    public static boolean isArmstrong(int number, int[] digits){
        int sum = 0;
        int power = digits.length;

        for (int d : digits){
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static void largestAndSecondLargest(int[] digits){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int d : digits){
            if(d>largest){
                secondLargest = largest;
                largest = d;
            }else if(d>secondLargest && d != largest){
                secondLargest = d;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    public static void smallestAndSecondSmallest(int[] digits){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int d : digits){
            if(d<smallest){
                secondSmallest = smallest;
                smallest = d;
            }else if(d<secondSmallest && d!=smallest){
                secondSmallest = d;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));

        largestAndSecondLargest(digits);
        smallestAndSecondSmallest(digits);
    }
}
