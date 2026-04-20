//Import java util package for Scanner
import java.util.*;

public class PositiveNegativeOrZero{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Initialize an array of 5 index
        int[] arr = new int[5];
		
		System.out.println("Enter 5 numbers : ");
		//Take user input for 5 numbers
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		//Use for loop for interating 
		for(int i=0; i<arr.length; i++){
		    //Check if the number is positive, Even or Odd, Negative or zero
		    if(arr[i] > 0){
				if((arr[i] > 0) && (arr[i]%2 == 0)){
			        System.out.println("The number "+arr[i]+" is positive and Even number");
			    }if((arr[i] > 0) && (arr[i]%2 != 0)){
			        System.out.println("The number "+arr[i]+" is positive and Odd number");
			    }
			}else if((arr[i] < 0)){
			    System.out.println("The number "+arr[i]+" is Negative");
			}else{
			    System.out.println("The number "+arr[i]+" is Zero");
			}
		}
		
		//Check 1st and last index are same or greater or less
		if(arr[0] == arr[4]){
			System.out.println("\n 1st and 2nd index both are equal");
		}else if(arr[0] > arr[4]){
			System.out.println("1st index is greater than last");
		}else{
			System.out.println("Last index is greater than 1st");
		}
    }
}