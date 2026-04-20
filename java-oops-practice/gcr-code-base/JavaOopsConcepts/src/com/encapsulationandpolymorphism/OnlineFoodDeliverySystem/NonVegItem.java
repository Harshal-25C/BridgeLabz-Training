package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

//Non-veg food item
class NonVegItem extends FoodItem implements Discountable{

NonVegItem(String name, double price, int quantity){
   super(name, price, quantity);
}

public double calculateTotalPrice(){
	 //Extra charge
   return (price*quantity)+50; 
}

public double applyDiscount(){
   return calculateTotalPrice()* 0.05;
}

public String getDiscountDetails(){
   return "5% Non-Veg Discount";
}
}
