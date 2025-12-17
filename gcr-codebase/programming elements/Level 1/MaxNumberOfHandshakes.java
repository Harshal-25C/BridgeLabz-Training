import java.util.*;

public class MaxNumberOfHandshakes{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number Of Students: ");
		
		//Take input as Number Of Students
        int numberOfStudents = sc.nextInt();

        //Use the combination = (n * (n - 1)) / 2 formula
        int handshake = (numberOfStudents * (numberOfStudents-1))/2;

        System.out.println("The number of possible handshakes : " + handshake);
    }
}