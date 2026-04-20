package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

//Veg food item
class VegItem extends FoodItem implements Discountable{

VegItem(String name, double price, int quantity){
   super(name, price, quantity);
}

public double calculateTotalPrice(){
   return price * quantity;
}

public double applyDiscount(){
   return calculateTotalPrice()*0.10;
}

public String getDiscountDetails(){
   return "10% Veg Discount";
}
}