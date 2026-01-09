package com.day8.RestaurantOrderingSystem;

public class NonVegItem extends FoodItem{
    public NonVegItem(String name, double price, int stock){
        super(name, "Non-Veg", price, stock);
    }

    @Override
    public double applyDiscount(double total){
        if(total >= 800){
            return total*0.05; //5% discount
        }
        return 0;
    }
}
