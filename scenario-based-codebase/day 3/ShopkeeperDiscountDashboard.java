//import java util package to access Scanner Class
import java.util.*;

public class ShopkeeperDiscountDashboard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Constant for number of items
        final int ITEMS_COUNT = 3;    
        double totalBill = 0;

        // for-loop to take item prices
        for (int i=1; i<=ITEMS_COUNT; i++){
            System.out.print("Enter price of item " + i + ": ");
            totalBill += sc.nextDouble();
        }

        //Apply discount using if-else logic
        if(totalBill >= 5000){
            totalBill *= 0.80; //20% discount
			
        }else if(totalBill >= 3000){
            totalBill *= 0.90; //10% discount
			
        }else if(totalBill >= 1000){
            totalBill *= 0.95; //5% discount
        }

        //Display final payable amount
        System.out.println("Final Bill Amount: ₹" + totalBill);
    }
} 