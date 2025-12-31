package com.inheritance.multilevelinheritance;

public class OnlineRetailOrderManagement {
	public static void main(String[] args) {

        Order order = new Order("ORD101", "10-Jan-2025");
        ShippedOrder shipped = new ShippedOrder("ORD102", "11-Jan-2025", "TRK456");
        DeliveredOrder delivered = new DeliveredOrder("ORD103", "12-Jan-2025", "TRK789", "15-Jan-2025");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }

}
