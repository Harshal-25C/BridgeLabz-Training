import java.util.*;

public class DiscountPriceAndAmount{
    public static void main(String[] args){
        int total_fee = 125000;
		int discount = 10;
		
		int discounted_amount = total_fee*10/100;
		int total_discounted_price = total_fee-discounted_amount;

        System.out.println("The discount amount is INR "+ discounted_amount+" and final discounted fee is INR "+total_discounted_price);
    }
}