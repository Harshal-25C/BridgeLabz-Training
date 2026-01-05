package com.sorting.MergeSort;

public class MergeSortBookPrices{
    //Method to divide the array
    static void mergeSort(int[] arr, int left, int right){

        if(left < right){

            //Find middle index
            int mid = (left + right)/2;

            //Sort left half
            mergeSort(arr, left, mid);

            //Sort right half
            mergeSort(arr, mid + 1, right);

            //Merge both halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for(int i=0; i<n1; i++)
            L[i] = arr[left+i];

        for (int j=0; j<n2; j++)
            R[j] = arr[mid+1+j];

        int i = 0, j = 0, k = left;

        //Merge arrays
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        //Copy remaining elements
        while(i<n1){
            arr[k++] = L[i++];
        }

        while(j<n2){
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args){
        int[] prices = {450, 299, 1200, 650, 399};

        mergeSort(prices, 0, prices.length-1);

        System.out.println("Sorted Book Prices:");
        for(int price:prices){
            System.out.print(price + " ");
        }
    }
}
