//Import java util package for Scanner
import java.util.*;

public class MultiplicationTableFromSixtoNine{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Initialize a number as a user input
		System.out.println("Enter any number: ");
        int number = sc.nextInt();
		
		//Initialize an array of 4 index
		int[] arr = new int[4];
		
		System.out.println("Multiplication of "+number+ " from 6 to 9 is: ");
		for(int i=6; i<=9; i++){
		    //prints the table of number using number*i
			arr[i-6] = number*i;
			System.out.println(number +"*"+ i +" == "+arr[i-6]);
		}
    }
}