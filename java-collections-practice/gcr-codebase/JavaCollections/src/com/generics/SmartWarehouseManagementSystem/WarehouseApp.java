package com.generics.SmartWarehouseManagementSystem;

public class WarehouseApp {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E101", "Laptop"));
        electronicsStorage.addItem(new Electronics("E102", "Smartphone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("G201", "Rice"));
        groceryStorage.addItem(new Groceries("G202", "Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F301", "Chair"));

        System.out.println("---- Electronics ----");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("---- Groceries ----");
        WarehouseUtil.displayItems(groceryStorage.getItems());

        System.out.println("---- Furniture ----");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
