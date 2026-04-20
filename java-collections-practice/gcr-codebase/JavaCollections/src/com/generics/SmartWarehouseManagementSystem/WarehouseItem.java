package com.generics.SmartWarehouseManagementSystem;

public abstract class WarehouseItem {

    private String itemId;
    private String name;

    public WarehouseItem(String itemId, String name) {
        this.itemId=itemId;
        this.name=name;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return itemId+" - "+name+" (" + getCategory()+")";
    }
}
