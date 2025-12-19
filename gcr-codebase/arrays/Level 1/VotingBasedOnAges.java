//Import java util package for Scanner
import java.util.*;

public class VotingBasedOnAges{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Initialize an array of 10 index
        int[] arr = new int[10];
		
		System.out.println("Enter the ages of 10 students: ");
		//Take user input of student ages
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
		    //Check if student is greater than or equal to 18 or not
		    if(arr[i] >= 18){
			    System.out.println("The student with the age "+arr[i]+" can vote.");
			}else{
			    System.out.println("The student with the age "+arr[i]+" cannot vote.");
			}
		}
    }
}
