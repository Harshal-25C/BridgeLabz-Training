package com.day2.SmartHospitalInventoryTracker;

import java.util.*;

public class MedicalInventoryMain {

    public static void main(String[] args) {

        try{
            MedInventory<String> inventory = new MedInventory<>();

            Map<String, List<Item<String>>> result =
                    inventory.processInventory("src/com/day2/SmartHospitalInventoryTracker/inventory/stock.csv");

            result.forEach((k, v) -> {
                System.out.println("\nCategory: " + k);
                v.forEach(System.out::println);
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
