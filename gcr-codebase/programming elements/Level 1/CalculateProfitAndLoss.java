import java.util.*;

public class CalculateProfitAndLoss{
    public static void main(String[] args){
        double cost_price = 129;
		double selling_price = 191;
		
		double profit = selling_price-cost_price;
		double profit_percentage = profit/cost_price*100;
		
		System.out.println("The Cost Price is INR "+ cost_price + " and Selling Price is INR "+selling_price+" The Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage);
    }
}