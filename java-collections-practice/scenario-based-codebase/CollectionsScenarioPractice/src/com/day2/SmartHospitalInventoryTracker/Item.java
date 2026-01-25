package com.day2.SmartHospitalInventoryTracker;

import java.util.Objects;

public class Item<T> {

    String itemId;
    T itemName;
    int quantity;
    String expiryDate;

    public Item(String itemId, T itemName, int quantity, String expiryDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return Objects.equals(itemId, item.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return itemId + " | " + itemName + " | Qty: " + quantity +" | Exp: " + expiryDate;
    }
}
