package com.day5.SensorDataOrdering;

public class SensorQuickSort {
    public static void quickSort(SensorData[] data, int low, int high) {

        if(low<high) {
            int pivot = partition(data, low, high);

            quickSort(data, low, pivot-1);
            quickSort(data, pivot+1, high);
        }
    }

    private static int partition(SensorData[] data, int low, int high) {

        long pivot = data[high].getTimestamp();
        int i = low-1;

        for(int j=low; j<high; j++) {
            if(data[j].getTimestamp() < pivot) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i+1, high);
        return i+1;
    }

    private static void swap(SensorData[] arr, int i, int j) {
        SensorData temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
