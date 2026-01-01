package com.encapsulationandpolymorphism.EcommercePlaform;

//Grocery product
class Groceries extends Product implements Taxable{

    Groceries(int id, String name, double price){
        super(id, name, price);
    }

    public double calculateDiscount(){
        return getPrice() * 0.05;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "5% GST";
    }
}
