package com.TimeAndSpaceComplexity;

import java.util.*;

public class SearchTargetInLargeDatasets{

    //Linear Search
    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = left+(right-left)/2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 1_000_000;  //Dataset size
        int[] data = new int[size];

        //Fill array with sorted values
        for(int i=0; i<size; i++){
            data[i] = i;
        }

        int target = size - 1;
        
        long startLinear = System.nanoTime();
        int linearIndex = linearSearch(data, target);
        long endLinear = System.nanoTime();

        
        long startBinary = System.nanoTime();
        int binaryIndex = binarySearch(data, target);
        long endBinary = System.nanoTime();
        
        
        System.out.println("Dataset Size: " +size);
        System.out.println("Target Element: " +target);

        System.out.println("\nLinear Search:");
        System.out.println("Index Found: "+linearIndex);
        System.out.println("Time Taken: " +(endLinear-startLinear)/1_000_000.0 + " ms");

        System.out.println("\nBinary Search:");
        System.out.println("Index Found: " + binaryIndex);
        System.out.println("Time Taken: "+(endBinary-startBinary)/ 1_000_000.0 + " ms");
    }
}
