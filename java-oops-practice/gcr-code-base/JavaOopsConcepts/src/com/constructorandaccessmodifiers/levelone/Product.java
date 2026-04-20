package com.constructorandaccessmodifiers.levelone;

public class Product{

	//Instance variables
    String productName;
    double price;

    //Class variable (shared among all objects)
    static int totalProducts = 0;

    //Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment count whenever a product is created
    }

    //Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }

    //Class (static) method to display total products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args){
        //Creating product objects
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Smartphone", 30000);
        Product p3 = new Product("Headphones", 2500);

        //Display individual product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        //Display total number of products
        Product.displayTotalProducts();
    }

}
