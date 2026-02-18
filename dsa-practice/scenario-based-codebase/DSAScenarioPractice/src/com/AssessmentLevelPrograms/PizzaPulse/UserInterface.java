package com.AssessmentLevelPrograms.PizzaPulse;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) throws InvalidPizzaOrderException {
		PizzaUtil pu = new PizzaUtil();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pizza order details");
		String input = sc.nextLine();
		
		String[] parts = input.split(":");
		
		String orderId = parts[0];
		String pizzaType = parts[1];
		double basePrice = Double.parseDouble(parts[2]);
		int quantity = Integer.parseInt(parts[3]);
		
		pu.validateOrderId(orderId);
		pu.validatePizzaType(pizzaType);
		pu.validateQuantity(quantity);
		
		double finalBill = pu.calculateFinalBill(pizzaType, basePrice, quantity);
		System.out.println("Total bill for "+pizzaType+" pizzas: "+finalBill);
	}
}
