import java.util.*;

public class QuotientAndReminder{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Take two numbers as input
	    System.out.println("Enter 1st Number: ");
		int number_1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int number_2 = sc.nextInt();

        //Uses division operator (/) for quotient and moduli operator (%) for reminder
        int quotient = number_1 / number_2;
		int reminder = number_1 % number_2;

        System.out.println("The Quotient is " +quotient+" and Reminder is "+reminder+" of two number "+number_1+" and "+number_2);
    }
}