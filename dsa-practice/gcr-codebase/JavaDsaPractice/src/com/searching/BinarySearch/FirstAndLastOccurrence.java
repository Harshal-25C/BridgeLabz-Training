package com.searching.BinarySearch;

public class FirstAndLastOccurrence{

    //Find first occurrence of target
    static int findFirst(int[] arr, int target){
        int left = 0, right=arr.length-1;
        int result = -1;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target) {
                result = mid;
                right = mid-1;   //move left
            } 
            else if(arr[mid] < target){
                left = mid+1;
            } 
            else {
                right = mid-1;
            }
        }
        return result;
    }

    //Find last occurrence of target
    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        int result = -1;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                result = mid;
                left = mid+1;  //move right
            } 
            else if(arr[mid] < target){
                left = mid+1;
            } 
            else {
                right = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
