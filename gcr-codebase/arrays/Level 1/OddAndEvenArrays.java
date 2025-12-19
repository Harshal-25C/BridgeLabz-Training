//Import java util package for Scanner
import java.util.*;

public class OddAndEvenArrays{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

		//Initialize number as a input 
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		// Validate the user input number, if negative state invalid and exit 
        if(number < 0){
            System.err.println("Invalid Number.");
            System.exit(0);
        }
		
		int size = number/2+1;

		//Initialize two arrays for storing odd and even numbers
		int oddArr[] = new int[size];
		int evenArr[] = new int[size];
		
		int evenIndex=0;
		int oddIndex=0;
		
		for(int i=1; i<=number; i++){
		    if(i%2 == 0){
			    evenArr[evenIndex] = i;
				evenIndex++;
			}else{
			    oddArr[oddIndex] = i;
				oddIndex++;
			}
		}
		System.out.println("Even elements : ");
		for(int i=0; i<evenIndex; i++){
		    System.out.println(evenArr[i]);
		}
		System.out.println("Odd elements : ");
		for(int i=0; i<oddIndex; i++){
		    System.out.println(oddArr[i]);
		}
		
    }
}