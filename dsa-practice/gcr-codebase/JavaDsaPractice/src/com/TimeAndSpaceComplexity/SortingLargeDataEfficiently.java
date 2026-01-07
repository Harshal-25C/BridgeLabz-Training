package com.TimeAndSpaceComplexity;

import java.util.Arrays;
import java.util.Random;

public class SortingLargeDataEfficiently{

    //Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            boolean swapped = false;
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; //optimization
        }
    }

    //Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right){
            int mid = left+(right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid+1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    //Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args){

        int size = 10000; //Change to 1000 / 10000 / 1000000
        int[] original=new int[size];
        Random random=new Random();

        for(int i=0; i<size; i++){
            original[i] = random.nextInt(size);
        }

        int[] bubbleArray = Arrays.copyOf(original, original.length);
        int[] mergeArray = Arrays.copyOf(original, original.length);
        int[] quickArray = Arrays.copyOf(original, original.length);

        long startBubble = System.nanoTime();
        bubbleSort(bubbleArray);
        long endBubble = System.nanoTime();

        long startMerge = System.nanoTime();
        mergeSort(mergeArray, 0, mergeArray.length - 1);
        long endMerge = System.nanoTime();

        long startQuick = System.nanoTime();
        quickSort(quickArray, 0, quickArray.length - 1);
        long endQuick = System.nanoTime();

        System.out.println("Dataset Size: " + size);

        System.out.println("\nBubble Sort (O(N²)):");
        System.out.println("Time Taken: " + (endBubble - startBubble)/1_000_000.0 +" ms");

        System.out.println("\nMerge Sort (O(N log N)):");
        System.out.println("Time Taken: " + (endMerge - startMerge)/1_000_000.0+" ms");

        System.out.println("\nQuick Sort (O(N log N)):");
        System.out.println("Time Taken: " + (endQuick - startQuick)/1_000_000.0+" ms");
    }
}
