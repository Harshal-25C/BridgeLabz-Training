package com.searching.ChallengeProblems;

import java.util.*;

public class LinearAndBinarySearchChallenge {

    //Linear Search
    static int firstMissingPositive(int[] arr){
        int n = arr.length;

        //Mark numbers present in array
        for(int i=0; i<n; i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1] != arr[i]) {
                //Swap to correct position
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }

        //Find first index where value is incorrect
        for(int i=0; i<n; i++){
            if (arr[i] != i+1){
                return i+1;
            }
        }

        return n+1;
    }

    //Binary Search
    static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length-1;

        while (left <= right) {

            int mid = left+(right-left)/2;

            if(arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid+1;
            else
                right = mid -1;
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] numbers = {3, 4, -1, 1};
        int target = 4;

        //Linear Search Result
        int missing = firstMissingPositive(numbers.clone());
        System.out.println("First Missing Positive Integer: " + missing);

        //Sort array for Binary Search
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        //Binary Search Result
        int index = binarySearch(numbers, target);
        System.out.println("Target Index: " + index);
    }
}
