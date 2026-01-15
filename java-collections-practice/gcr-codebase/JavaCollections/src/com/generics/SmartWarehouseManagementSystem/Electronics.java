package com.generics.SmartWarehouseManagementSystem;

public class Electronics extends WarehouseItem {

    public Electronics(String itemId, String name){
        super(itemId, name);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
