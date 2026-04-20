package com.day8.RestaurantOrderingSystem;

import java.util.Arrays;

public class FoodLoopApp{
    public static void main(String[] args) {

        FoodItem paneer = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 350, 3);
        FoodItem PavBhaji = new VegItem("Pav Bhaji", 200, 2);

        Order order = new Order(paneer, chicken, PavBhaji);
        order.placeOrder();
        order.cancelOrder();
    }
}
