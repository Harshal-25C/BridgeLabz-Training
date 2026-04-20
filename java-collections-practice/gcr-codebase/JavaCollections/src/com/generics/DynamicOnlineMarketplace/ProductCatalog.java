package com.generics.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

    private List<Product<? extends Category>> catalog = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        catalog.add(product);
    }

    public void displayCatalog() {
        for(Product<? extends Category> p:catalog) {
            System.out.println(p);
        }
    }
}
