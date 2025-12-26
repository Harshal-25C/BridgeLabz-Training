//Import java util package for Scanner
import java.util.*;

public class MultiplicationTable{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Initialize a number as a user input
		System.out.println("Enter any number: ");
        int number = sc.nextInt();
		
		//Initialize an array of 10 index
		int[] arr = new int[11];
		
		System.out.println("Multiplication of "+number+ " is: ");
		for(int i=1; i<=10; i++){
		    //prints the table of number using number*i
			arr[i] = number*i;
			System.out.println(number +"*"+ i +" == "+arr[i]);
		}
    }
}