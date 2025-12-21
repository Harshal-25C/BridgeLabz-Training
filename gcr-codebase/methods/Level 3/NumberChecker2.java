//import java util package to access Scanner class
import java.util.*;

public class NumberChecker2{
    //Create a method named countDigits to count digits of a number
    public static int countDigits(int number){
        int count = 0;
        while(number != 0){
            count++;
            number/=10;
        }
        return count;
    }

    public static int[] storeDigits(int number){
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count-1; i>=0; i--){
            digits[i] = number%10;
            number/=10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits){
        int sum = 0;
        for(int d : digits){
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits){
        int sum = 0;
        for (int d : digits){
            sum+=Math.pow(d,2);
        }
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits){
        int sum = sumOfDigits(digits);
        return number%sum == 0;
    }

    public static int[][] digitFrequency(int[] digits){
        int[][] freq = new int[10][2];

        for(int i=0; i<10; i++){
            freq[i][0] = i;
        }

        for(int d : digits){
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
		
        //Access storeDigits method
        int[] digits = storeDigits(number);

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i=0; i<10; i++){
            if (freq[i][1]>0){
                System.out.println("Digit " + freq[i][0] + " : " + freq[i][1]);
            }
        }
    }
}
