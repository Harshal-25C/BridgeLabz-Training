package com.day4.TicketPriceOptimizer;

public class TicketQuickSort {

    public static void quickSort(Ticket[] tickets, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(tickets, low, high);

            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex+1, high);
        }
    }

    private static int partition(Ticket[] tickets, int low, int high) {

        double pivot = tickets[high].getPrice();
        int i=low-1;

        for(int j=low; j<high; j++) {
            if(tickets[j].getPrice() < pivot) {
                i++;
                swap(tickets, i, j);
            }
        }

        swap(tickets, i+1, high);
        return i+1;
    }

    private static void swap(Ticket[] arr, int i, int j) {
        Ticket temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
