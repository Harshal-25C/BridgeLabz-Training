package com.encapsulationandpolymorphism.EcommercePlaform;

//Clothing product
class Clothing extends Product{

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}
