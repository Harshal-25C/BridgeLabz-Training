package com.encapsulationandpolymorphism.EcommercePlaform;
import java.util.*;

//Main class to demonstrate polymorphism
public class ECommercePlatform {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "T-Shirt", 1500));
        products.add(new Groceries(3, "Rice Bag", 1200));

        //Polymorphic processing of products
        for (Product p : products) {
            p.printFinalPrice();
        }
    }
}