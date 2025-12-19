//Imported java util package to access scanner class
import java.util.*;

public class FrequencyOfEachDigit{
    public static void main(String[] args){
		//Initialize Scanner 
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		int temp = number;
		int count=0;
		
		while(temp != 0){
			count++;
			temp = temp/10;
		}
		
		int[] digits = new int[count];
		
		//Initialize an array to store frequency of digits
		int[] freq = new int[10];
		temp = number;
		
		int j=0;
		while (temp != 0) {
            digits[j] = temp%10;
            temp = temp/10;
            j++;
        }
		for(int i=0; i<count; i++){
		    freq[digits[i]]++;
		}
		
		//Prints the frequency of digits
		for(int i=0; i<freq.length; i++){
		    if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
		}
	}
}