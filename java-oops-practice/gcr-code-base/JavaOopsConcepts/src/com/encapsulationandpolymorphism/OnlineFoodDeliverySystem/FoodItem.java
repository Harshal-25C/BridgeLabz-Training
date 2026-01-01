package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

abstract class FoodItem{
	 private String itemName;
	 protected double price;
	 protected int quantity;

	 //Constructor
	 FoodItem(String itemName, double price, int quantity){
	     this.itemName = itemName;
	     this.price = price;
	     this.quantity = quantity;
	 }
	 abstract double calculateTotalPrice();

	 //Concrete method to display item details
	 public void getItemDetails() {
	     System.out.println("Item: " + itemName);
	     System.out.println("Quantity: " + quantity);
	     System.out.println("Total Price: ₹" + calculateTotalPrice());
	 }
}