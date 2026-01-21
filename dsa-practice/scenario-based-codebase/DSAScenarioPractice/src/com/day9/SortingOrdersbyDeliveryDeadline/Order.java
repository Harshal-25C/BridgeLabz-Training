package com.day9.SortingOrdersbyDeliveryDeadline;

public class Order {
	int orderId;
	String customerName;
	int deliveryDay;
	
	Order(int orderId, String customerName, int deliveryDay){
		this.orderId = orderId;
		this.customerName = customerName;
		this.deliveryDay = deliveryDay;
	}
	
	@Override
	public String toString() {
		return "Order ID: "+orderId+" Customer Name: "+customerName+" Delivery Day: "+deliveryDay;
	}
}
