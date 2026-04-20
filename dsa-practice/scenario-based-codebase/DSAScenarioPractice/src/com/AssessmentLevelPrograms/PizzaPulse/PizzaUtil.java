package com.AssessmentLevelPrograms.PizzaPulse;

public class PizzaUtil {
	public boolean validateOrderId(String orderId) throws InvalidPizzaOrderException{
		String regex = "^PZ-[0-9]{3}$";
		
		if(!orderId.matches(regex)) {
			throw new InvalidPizzaOrderException("The order ID "+orderId+" is invalid");
		}
		return true;
	}
	
	public boolean validatePizzaType(String pizzaType) throws InvalidPizzaOrderException{
		if(!(pizzaType.equals("Margherita") || pizzaType.equals("Pepperoni") || pizzaType.equals("Veggie")
				|| pizzaType.equals("BBQ Chicken"))) {
			throw new InvalidPizzaOrderException("The pizza type "+pizzaType+" is invalid.");
		}
		return true;
	}
	
	public boolean validateQuantity(int quantity) throws InvalidPizzaOrderException{
		if(quantity < 0 || quantity > 50) {
			throw new InvalidPizzaOrderException("The quantity "+quantity+" is invalid.");
		}
		return true;
	}
	
	public double calculateFinalBill(String pizzaType, double basePrice, int quantity) throws InvalidPizzaOrderException{
		double toppingPercentages=0;
		
		switch(pizzaType) {
		    case "Margherita":
		    	toppingPercentages = 10;
		    	break;
		    case "Pepperoni":
		    	toppingPercentages = 20;
		    	break;
		    case "Veggie":
		    	toppingPercentages = 15;
		    	break;
		    case "BBQ Chicken":
		    	toppingPercentages = 25;
		    	break;
		    default:
		    	throw new InvalidPizzaOrderException(
		    			"The pizza type "+pizzaType+" is invalid."
		    	);
		}
		
		double baseCost = basePrice * quantity;
		double toppingCharge = (baseCost * toppingPercentages)/100;
		double deliveryFee = 100;
		
		if(basePrice < 200) {
			throw new InvalidPizzaOrderException("Invalid base price for "+pizzaType);
		}
		
		return baseCost + toppingCharge+deliveryFee;
	}
}