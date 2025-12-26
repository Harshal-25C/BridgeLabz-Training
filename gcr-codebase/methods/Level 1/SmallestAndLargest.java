//Imported java util package to access Scanner class
import java.util.Scanner;

public class SmallestAndLargest{
    //Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
	    //Use Math.min method to find smallest number
        int smallest = Math.min(number1, Math.min(number2, number3));
		//Use Math.max method to find largest number
        int largest = Math.max(number1, Math.max(number2, number3));

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        //Initialize Scanner class
        Scanner sc = new Scanner(System.in);
        
		//Take input of three numbers
        System.out.println("Enter three numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        //Access the method findSmallestAndLargest
        int[] result1 = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest number: " + result1[0]);
        System.out.println("Largest number: " + result1[1]);
    }
}
