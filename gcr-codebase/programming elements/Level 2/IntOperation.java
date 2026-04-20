import java.util.*;

public class IntOperation{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		//Take three inputs as an integer
        System.out.println("Enter 1st Integer value: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Integer value: ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd Integer value: ");
        int c = sc.nextInt();

        //Compute 3 integer operations and assign the result to a variable
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        //Print the results of the integer operations
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
