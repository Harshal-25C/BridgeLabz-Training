//Import java util package for Scanner
import java.util.*;

public class LargestSecondLargestDigits{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;               
        int[] digits = new int[maxDigit];  
        int index = 0;

        //Extract digits and store in array
        while(number!=0){
            if(index == maxDigit){
                break;
            }
            digits[index] = number % 10; 
            number = number/10;
            index++;
        }

        //Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        //Find largest and second largest digit
        for(int i = 0; i < index; i++){
            if(digits[i]>largest){
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i]>secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
