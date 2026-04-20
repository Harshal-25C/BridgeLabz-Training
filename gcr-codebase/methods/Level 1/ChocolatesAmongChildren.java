//Imported java util package to access Scanner class
import java.util.*;

public class ChocolatesAmongChildren{
	//Method to find remainder and quotient
	public static int[] findRemainderAndQuotient(int number, int divisor){
	    //Use division operator (/) for quotient and moduli operator (%) for reminder
        int quotient = number/divisor;
        int remainder = number%divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter number of chocolates:");
        int numberOfChocolates = sc.nextInt();

        System.out.println("Enter number of children:");
        int numberOfChildren = sc.nextInt();

        int[] result3 = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates per child: " + result3[0]);
        System.out.println("Remaining chocolates: " + result3[1]);

    }
}