import java.util.*;

public class StudentFeeAndUniDiscount{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fee: ");
        int fee = sc.nextInt();
		
		System.out.println("Enter the percentage of discount: ");
		int discountPercent = sc.nextInt();
		
		int discounted_amount = fee*10/100;
		int total_discounted_price = fee-discounted_amount;

        System.out.println("The discount amount is INR "+ discounted_amount+" and final discounted fee is INR "+total_discounted_price);
    }
}