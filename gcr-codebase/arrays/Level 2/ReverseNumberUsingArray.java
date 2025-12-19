//Import java util package to access Scanner class
import java.util.Scanner;

public class ReverseNumberUsingArray{
    public static void main(String[] args){
        //Create Scanner class
        Scanner sc = new Scanner(System.in);

        //Take number as user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        //Find the count of digits
        while(temp != 0){
            count++;
            temp = temp/10;
        }

        //Create array to store digits
        int[] digits = new int[count];
        temp = number;

        for(int i=0; i<count; i++){
            digits[i] = temp%10;
            temp /=10;
        }

        //\Create array to store reversed digits
        int[] revDigits = new int[count];

        for (int i=0; i<count; i++) {
            revDigits[i] = digits[i];
        }

        //Display reversed number
        System.out.print("Reversed number: ");
        for (int i=0; i <count; i++) {
            System.out.print(revDigits[i]);
        }
    }
}
