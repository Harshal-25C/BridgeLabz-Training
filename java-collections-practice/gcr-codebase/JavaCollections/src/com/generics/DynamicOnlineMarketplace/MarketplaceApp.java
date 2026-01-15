package com.generics.DynamicOnlineMarketplace;

public class MarketplaceApp {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("B101", "Java Programming", 599, new BookCategory());

        Product<ClothingCategory> shirt = new Product<>("C201", "Cotton Shirt", 999, new ClothingCategory());

        Product<GadgetCategory> phone = new Product<>("G301", "Smartphone", 29999, new GadgetCategory());

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.displayCatalog();
    }
}
