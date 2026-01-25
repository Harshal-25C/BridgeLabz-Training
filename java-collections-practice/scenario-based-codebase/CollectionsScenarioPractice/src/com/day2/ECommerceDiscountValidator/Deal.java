package com.day2.ECommerceDiscountValidator;
import java.time.LocalDate;

public class Deal<T> {
    private String dealCode;
    private LocalDate validTill;
    private T discountOrValue; // could be percentage, cashback, etc.
    private double minimumPurchase;

    public Deal(String dealCode, LocalDate validTill, T discountOrValue, double minimumPurchase) {
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discountOrValue = discountOrValue;
        this.minimumPurchase = minimumPurchase;
    }

    public String getDealCode() {
        return dealCode;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public T getDiscountOrValue() {
        return discountOrValue;
    }

    public double getMinimumPurchase() {
        return minimumPurchase;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "dealCode='" + dealCode + '\'' +
                ", validTill=" + validTill +
                ", discountOrValue=" + discountOrValue +
                ", minimumPurchase=" + minimumPurchase +
                '}';
    }
}

