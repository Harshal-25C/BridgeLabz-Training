package com.objectmodeling;

public class EcommercePlatform {
 public static void main(String[] args) {

     Customer1 customer = new Customer1("Rohit");

     Product p1 = new Product("Laptop", 55000);
     Product p2 = new Product("Mouse", 500);

     Order order = new Order(101);
     order.addProduct(p1);
     order.addProduct(p2);

     customer.placeOrder(order);
 }
}
