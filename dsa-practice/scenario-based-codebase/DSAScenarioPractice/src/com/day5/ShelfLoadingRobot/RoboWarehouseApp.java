package com.day5.ShelfLoadingRobot;
import java.util.*;

public class RoboWarehouseApp {

    public static void main(String[] args) {

        List<PackageItem> shelf = new ArrayList<>();
        shelf.add(new PackageItem(1, 12.5));
        shelf.add(new PackageItem(2, 5.0));
        shelf.add(new PackageItem(3, 8.3));

        RoboWarehouseSorter.insertionSort(shelf);

        for(PackageItem p:shelf) {
            System.out.println(p);
        }
    }
}
