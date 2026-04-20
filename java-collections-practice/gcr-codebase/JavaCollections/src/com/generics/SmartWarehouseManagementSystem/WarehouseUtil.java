package com.generics.SmartWarehouseManagementSystem;
import java.util.List;

public class WarehouseUtil {

    public static void displayItems(List<? extends WarehouseItem> items) {

        for(WarehouseItem item:items) {
            System.out.println(item);
        }
    }
}
