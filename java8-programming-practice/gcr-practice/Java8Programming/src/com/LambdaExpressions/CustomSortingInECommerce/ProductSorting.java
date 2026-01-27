package com.LambdaExpressions.CustomSortingInECommerce;

import java.util.*;

public class ProductSorting {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Phone", 25000, 4.5, 10),
                new Product("Laptop", 60000, 4.7, 15),
                new Product("Headphones", 3000, 4.2, 25)
        );

        //Sort by price
        products.stream().sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(System.out::println);

        //Sort by rating (descending)
        products.stream().sorted((a, b) -> Double.compare(b.rating, a.rating))
                .forEach(System.out::println);

        //Sort by discount
        products.stream().sorted(Comparator.comparingInt(p -> p.discount))
                .forEach(System.out::println);
    }
}
