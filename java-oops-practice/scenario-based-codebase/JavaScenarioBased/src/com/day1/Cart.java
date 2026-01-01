package com.day1;

public class Cart{
    Product[] products = new Product[5];
    int count = 0;

    // Method to add a product to the cart
    void addToCart(Product product) {
        products[count++] = product;
    }

    // Method to calculate total price of products
    double calculateTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].price;
        }
        return total;
    }

    // Method to display cart contents
    void displayCart() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].name + " - ₹" + products[i].price);
        }
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}
