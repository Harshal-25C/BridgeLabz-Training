package com.generics.DynamicOnlineMarketplace;

public class Product<T extends Category> {

    private String productId;
    private String name;
    private double price;
    private T category;

    public Product(String productId, String name, double price, T category) {
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name+" | ₹"+price+" | "+category.getCategoryName();
    }
}
