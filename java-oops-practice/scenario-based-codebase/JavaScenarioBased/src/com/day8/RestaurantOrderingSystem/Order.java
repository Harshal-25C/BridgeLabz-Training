package com.day8.RestaurantOrderingSystem;

import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();
    private double total;

    //Constructor for custom combo meals
    public Order(FoodItem... comboItems){ // Varages...
        for(FoodItem item : comboItems) {
            if(item.isAvailable()){
                items.add(item);
                total += item.price;
                item.reduceStock();
            }
        }
    }

    // Polymorphism: discount varies by total
    public double applyDiscount() {
        if(total>=1000) return total*0.15;
        if(total>=500)  return total*0.10;
        return 0;
    }

    public double getFinalAmount(){
        return total-applyDiscount();
    }

    @Override
    public void placeOrder(){
        System.out.println("Order placed. Final amount: "+getFinalAmount());
    }

    @Override
    public void cancelOrder(){
        System.out.println("Order cancelled.");
    }
}