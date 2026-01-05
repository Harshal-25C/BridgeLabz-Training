package com.sorting.HeapSort;

public class HeapSortSalaries{
    //Heap sort method
    static void heapSort(int[] arr){

        int n = arr.length;

        //Build max heap
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--){

            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    //Heapify method
    static void heapify(int[] arr, int size, int root){

        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        //Check left child
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        //Check right child
        if(right<size && arr[right]>arr[largest]){
            largest = right;
        }

        //Swap and continue heapifying if needed
        if(largest != root){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args){

        int[] salaries = {45000, 70000, 50000, 60000, 55000};

        heapSort(salaries);

        System.out.println("Sorted Salary Demands:");
        for(int salary:salaries){
            System.out.print(salary + " ");
        }
    }
}
