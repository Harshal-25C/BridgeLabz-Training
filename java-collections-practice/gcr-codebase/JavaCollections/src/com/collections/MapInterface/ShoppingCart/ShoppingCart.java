package com.collections.MapInterface.ShoppingCart;
import java.util.*;

public class ShoppingCart {

    //Product -> Price
    private Map<String, Double> priceMap = new HashMap<>();

    //Product -> Quantity (maintains insertion order)
    private Map<String, Integer> cart = new LinkedHashMap<>();

    public void addProduct(String product, double price, int quantity) {
        priceMap.put(product, price);
        cart.put(product, cart.getOrDefault(product, 0)+quantity);
    }

    //Display cart in insertion order
    public void displayCart() {
        System.out.println("Cart Items (Insertion Order):");
        for(String product:cart.keySet()) {
            System.out.println(product +" | Qty: " + cart.get(product) +
                    " | Price: " + priceMap.get(product));
        }
    }

    public void displaySortedByPrice() {

        TreeMap<Double, List<String>> sortedMap = new TreeMap<>();

        for(String product : cart.keySet()) {
            double price = priceMap.get(product);
            sortedMap.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
        }

        System.out.println("\nItems Sorted by Price:");
        sortedMap.forEach((price, products) -> {
            for(String p : products) {
                System.out.println(p+" -> ₹"+price);
            }
        });
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 50000, 1);
        cart.addProduct("Mouse", 500, 2);
        cart.addProduct("Keyboard", 1500, 1);

        cart.displayCart();
        cart.displaySortedByPrice();
    }
}
