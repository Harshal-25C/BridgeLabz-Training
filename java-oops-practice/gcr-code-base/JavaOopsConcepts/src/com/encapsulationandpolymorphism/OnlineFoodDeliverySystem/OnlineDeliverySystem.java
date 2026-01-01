package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;
import java.util.*;

public class OnlineDeliverySystem{
 public static void main(String[] args) {

     List<FoodItem> order = new ArrayList<>();

     order.add(new VegItem("Paneer Burger", 150, 2));
     order.add(new NonVegItem("Chicken Pizza", 400, 1));

     for(FoodItem item:order){
         item.getItemDetails();

         Discountable d = (Discountable) item;
         System.out.println("Discount: ₹" + d.applyDiscount());
         System.out.println(d.getDiscountDetails());
         System.out.println("------------------------");
     }
 }
}
