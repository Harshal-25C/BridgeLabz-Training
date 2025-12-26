//Import java util package for Scanner
import java.util.*;

public class UntilUserEnterZero{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);
		
		//Initialize an array of 10 index
		double[] arr = new double[10];
		
		double total = 0.0;
		
		System.out.println("Enter any number :");
		int i=0;
		while(i<10){
		    arr[i] = sc.nextDouble();
		    System.out.println("Again enter any number :");
			if((arr[i] == 0) || (arr[i] < 0)){
			    break;
			}
			i++;
		}
		
		for(int j=0; j<arr.length; j++){
		    total += arr[j];
		}
		
		System.out.println("The total of all Values is: "+ total);
    }
}