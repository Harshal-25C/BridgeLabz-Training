package com.encapsulationandpolymorphism.EcommercePlaform;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    //Constructor
    Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //Encapsulation through getters/setters
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();

    //Method to display final price
    public void printFinalPrice() {
        double tax = (this instanceof Taxable)
                ? ((Taxable) this).calculateTax()
                : 0;

        double finalPrice = price + tax - calculateDiscount();

        System.out.println(name + " Final Price: ₹" + finalPrice);
    }
}
