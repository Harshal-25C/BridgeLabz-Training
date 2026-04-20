package com.day4.SwiftCart;

public abstract class Product{
    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public abstract double getDiscount();

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
