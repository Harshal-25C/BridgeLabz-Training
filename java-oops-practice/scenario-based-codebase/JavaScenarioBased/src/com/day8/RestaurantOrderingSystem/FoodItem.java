package com.day8.RestaurantOrderingSystem;

abstract class FoodItem {
	protected String name;
	protected String category;
	protected double price;
	private int availability;
	
	
	public FoodItem(String name, String category, double price, int availability) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	} 
	
	public boolean isAvailable() {
		return availability > 0;
	}
	public void reduceStock() {
		if(availability > 0) availability--;
	}

	protected void restoreStock() {
		availability++;
	}
	
	public abstract double applyDiscount(double total);
}
