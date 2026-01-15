package com.generics.DynamicOnlineMarketplace;

public class DiscountUtil {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}
