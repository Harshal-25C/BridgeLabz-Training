package com.LambdaExpressions.CustomSortingInECommerce;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | ₹" + price + " | ⭐" + rating + " | " + discount + "%";
    }
}
