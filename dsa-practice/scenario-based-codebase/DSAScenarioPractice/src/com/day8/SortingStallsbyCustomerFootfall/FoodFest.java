package com.day8.SortingStallsbyCustomerFootfall;

public class FoodFest {

    public static void mergeSort(Stall[] stalls, int left, int right) {
        if(left < right) {
            int mid = (left+right)/2;
            mergeSort(stalls, left, mid);
            mergeSort(stalls, mid+1, right);
            merge(stalls, left, mid, right);
        }
    }

    public static void merge(Stall[] stalls, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;

        Stall[] L = new Stall[n1];
        Stall[] R = new Stall[n2];

        for(int i=0; i<n1; i++)
            L[i] = stalls[left+i];
        for(int j=0; j<n2; j++)
            R[j] = stalls[mid+1+j];

        int i=0, j=0, k=left;

        while(i<n1 && j<n2) {
            if(L[i].footfall <= R[j].footfall) {
                stalls[k++] = L[i++];
            }else {
                stalls[k++] = R[j++];
            }
        }

        while (i < n1) stalls[k++] = L[i++];
        while (j < n2) stalls[k++] = R[j++];
    }

    public static void main(String[] args) {
        Stall[] stalls = {
            new Stall("Pizza Hub", 120),
            new Stall("Burger Point", 300),
            new Stall("Dosa Corner", 200),
            new Stall("Ice Cream Zone", 180)
        };

        mergeSort(stalls, 0, stalls.length-1);

        System.out.println("Sorted Stalls by Footfall:");
        for(Stall s:stalls) {
            System.out.println(s);
        }
    }
}
