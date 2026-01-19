package com.day7.ProductSortingbyDiscount;

public class FlashDealzApp {

    //Quick Sort method
    public static void quickSort(Product[] products, int low, int high) {
        if(low < high) {
            int pi = partition(products, low, high);
            quickSort(products, low, pi-1);
            quickSort(products, pi+1, high);
        }
    }

    private static int partition(Product[] products, int low, int high) {
        int pivot = products[high].discount;
        int i = low-1;

        for(int j=low; j<high; j++) {
            if (products[j].discount > pivot) { 
                i++;
                swap(products, i, j);
            }
        }

        swap(products, i+1, high);
        return i+1;
    }

    //Swap utility
    private static void swap(Product[] products, int i, int j) {
        Product temp = products[i];
        products[i] = products[j];
        products[j] = temp;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", 30),
            new Product(102, "Mobile", 50),
            new Product(103, "Headphones", 20),
            new Product(104, "Smart Watch", 40),
            new Product(105, "Tablet", 35)
        };

        System.out.println("Before Sorting:");
        for(Product p : products) {
            System.out.println(p);
        }

        quickSort(products, 0, products.length-1);

        System.out.println("\nAfter Sorting (High Discount First):");
        for(Product p:products) {
            System.out.println(p);
        }
    }
}
