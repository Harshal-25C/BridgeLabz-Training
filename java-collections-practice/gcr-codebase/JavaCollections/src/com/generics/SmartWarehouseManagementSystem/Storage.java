package com.generics.SmartWarehouseManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getItems() {
        return items;
    }
}
