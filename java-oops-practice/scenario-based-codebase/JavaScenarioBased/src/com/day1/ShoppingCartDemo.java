package com.day1;

public class ShoppingCartDemo{
    public static void main(String[] args){

        // Creating product objects
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 800);

        // Creating cart object
        Cart cart = new Cart();

        // Performing cart operations
        cart.addToCart(p1);
        cart.addToCart(p2);

        // Displaying final output
        cart.displayCart();
    }
}