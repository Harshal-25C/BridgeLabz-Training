package com.day7.ProductSortingbyDiscount;

public class Product {
    int productId;
    String productName;
    int discount;

    public Product(int productId, String productName, int discount) {
        this.productId = productId;
        this.productName = productName;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ProductId: " + productId +
               ", Name: " + productName +
               ", Discount: " + discount + "%";
    }
}