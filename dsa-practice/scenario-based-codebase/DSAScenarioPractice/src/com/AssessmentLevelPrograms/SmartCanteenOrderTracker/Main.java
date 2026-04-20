package com.AssessmentLevelPrograms.SmartCanteenOrderTracker;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<FoodOrder> orders = new ArrayList<>();

        boolean running = true;

        while(running) {

            System.out.print("\nEnter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Food Item (Burger/Pizza/Sandwich): ");
            String item = sc.nextLine().toLowerCase();

            double price = 0;

            // Validate food item using switch-case
            switch (item) {
                case "burger":
                    price = 80;
                    break;
                case "pizza":
                    price = 120;
                    break;
                case "sandwich":
                    price = 60;
                    break;
                default:
                    System.out.println("Invalid food item! Order skipped.");
                    continue; // skip invalid item
            }

            int quantity = 0;

            // 🔹 Exception handling for quantity
            try {
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();
                if (quantity <= 0) {
                    throw new IllegalArgumentException("Quantity must be positive.");
                }
            } catch (Exception e) {
                System.out.println("Invalid quantity! Order skipped.");
                sc.nextLine(); // clear buffer
                continue;
            }

            sc.nextLine(); // clear newline

            FoodOrder order = new FoodOrder(name, item, quantity, price);
            orders.add(order);

            System.out.println("Order Added Successfully!");

            System.out.print("Do you want to place another order? (yes/no): ");
            String choice = sc.nextLine();
            if(!choice.equalsIgnoreCase("yes")) {
                running = false;
            }
        }

        //Final Summary
        System.out.println("\n===== FINAL ORDER SUMMARY =====");

        double grandTotal = 0;

        for(FoodOrder order : orders) {
            System.out.println(order);
            grandTotal += order.getTotalAmount();
        }

        System.out.println("--------------------------------");
        System.out.println("Grand Total: ₹" + grandTotal);

        sc.close();
    }
}
