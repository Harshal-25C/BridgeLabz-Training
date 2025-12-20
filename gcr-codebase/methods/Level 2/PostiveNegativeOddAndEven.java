//Import java util package to access Scanner package
import java.util.*;

public class PostiveNegativeOddAndEven{
    //Check positive or negative
    public static boolean isPositive(int number){
        return number >= 0;
    }

    //Check even or odd
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    //Compare two numbers
    public static int compare(int number1, int number2){
        if(number1 > number2){
            return 1;
        }else if(number1 == number2){
            return 0;
        }else
            return -1;
    }

    public static void main(String[] args){
        //Initialize Scanner class
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        //Check each number
        for(int i=0; i<numbers.length; i++){
            if(isPositive(numbers[i])){
                if(isEven(numbers[i])){
                    System.out.println(numbers[i] + " is Positive and Even");
                }else{
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            }else{
                System.out.println(numbers[i] + " is Negative");
            }
        }

        //Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last elements:");
        if (result == 1){
            System.out.println("First element is greater than last element");
        }else if (result == 0){
            System.out.println("First and last elements are equal");
        }else{
            System.out.println("First element is less than last element");
        }
    }
}
