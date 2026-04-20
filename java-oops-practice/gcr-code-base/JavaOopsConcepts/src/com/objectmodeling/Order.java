package com.objectmodeling;

import java.util.ArrayList;

//Order class (Aggregates Products)
class Order {
 int orderId;
 ArrayList<Product> products = new ArrayList<>();

 Order(int orderId) {
     this.orderId = orderId;
 }

 void addProduct(Product product) {
     products.add(product);
 }

 void showOrderDetails() {
     System.out.println("Order ID: " + orderId);
     for (Product p : products) {
         System.out.println(p.productName + " - ₹" + p.price);
     }
 }
}



