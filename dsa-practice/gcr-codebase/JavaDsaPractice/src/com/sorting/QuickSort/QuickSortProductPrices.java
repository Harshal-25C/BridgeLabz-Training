package com.sorting.QuickSort;

public class QuickSortProductPrices {

    // Quick Sort method
    static void quickSort(int[] arr, int low, int high) {

        if(low < high){

            //Partition index
            int pi = partition(arr, low, high);

            //Sort left and right partitions
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method using last element as pivot
    static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<high; j++){

            if(arr[j]<pivot){
                i++;

                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Place pivot in correct position
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args){
        int[] prices = {999, 450, 1200, 299, 799};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        for(int price : prices){
            System.out.print(price + " ");
        }
    }
}
