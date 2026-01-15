package com.generics.SmartWarehouseManagementSystem;

public class Groceries extends WarehouseItem {

    public Groceries(String itemId, String name) {
        super(itemId, name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
