//Imported java util package to access scanner class
import java.util.*;

public class HandShakes{
    //Initialize a method possibleHandShakes
    public int possibleHandShakes(int numberOfStudents){
	    //Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
	    int maxHandShakes = (numberOfStudents*(numberOfStudents-1))/2;
		
		//return value as a maxHandShakes
		return maxHandShakes;
	}
    public static void main(String[] args){
		//Initialize Scanner 
	    Scanner sc = new Scanner(System.in);
		
		//Initialize numberOfStudents as a user input
		System.out.println("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		
		//Create an object of class HandShakes
		HandShakes hs = new HandShakes();
		
		//Access the method possibleHandShakes through object hs
		int posHandShakes = hs.possibleHandShakes(numberOfStudents);
		
		System.out.println("Possible number of handshakes between "+numberOfStudents+" students "+ posHandShakes);
	}
}