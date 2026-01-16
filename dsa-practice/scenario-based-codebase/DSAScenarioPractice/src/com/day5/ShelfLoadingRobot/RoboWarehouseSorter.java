package com.day5.ShelfLoadingRobot;
import java.util.List;

public class RoboWarehouseSorter {
    public static void insertionSort(List<PackageItem> packages) {

        for(int i=1; i<packages.size(); i++) {

            PackageItem key = packages.get(i);
            int j=i-1;

            while(j >= 0 && packages.get(j).getWeight() > key.getWeight()) {

                packages.set(j+1, packages.get(j));
                j--;
            }

            packages.set(j+1, key);
        }
    }
}
