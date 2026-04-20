package com.day4.SwiftCart;

import java.util.ArrayList;

public class Cart implements ICheckout{
    private ArrayList<Product> products;
    private double totalPrice;

    //Constructor without items
    public Cart(){
        products = new ArrayList<>();
        totalPrice = 0;
    }

    //Constructor with pre-selected items
    public Cart(ArrayList<Product> products){
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity){
        products.add(product);
        totalPrice += product.getPrice()*quantity;
    }

    //Only Cart can calculate price
    private void calculateTotal(){
        totalPrice = 0;
        for(Product p:products){
            totalPrice+=p.getPrice();
        }
    }

    @Override
    public void applyDiscount(double coupon) {
        double productDiscount = 0;

        for(Product p:products){
            productDiscount += p.getDiscount();
        }

        totalPrice = totalPrice-productDiscount-coupon;
    }

    @Override
    public void generateBill(){
        System.out.println("\n--- SwiftCart Bill ---");
        for(Product p:products){
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Total Payable Amount: ₹" + totalPrice);
    }
}

