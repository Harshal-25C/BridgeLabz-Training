package com.day2.ECommerceDiscountValidator;

import java.util.*;

public class DealTrackerApp {
    public static void main(String[] args) {
        DealTracker tracker = new DealTracker();
        tracker.loadDeals("src/com/day2/ECommerceDiscountValidator/deals.txt"); // your input file

        System.out.println("All Valid Deals:");
        tracker.printAllDeals();

        System.out.println("\nDeals Sorted by Discount:");
        tracker.printSortedByDiscount();
    }
}
