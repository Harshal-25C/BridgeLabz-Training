package com.sorting.InsertionSort;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args){

        int[] empIds = {104, 101, 109, 102, 106};

        //Insertion Sort logic
        for(int i=1; i<empIds.length; i++){

            int key = empIds[i];   //Current element to insert
            int j = i-1;

            // Shift elements to the right
            while(j>=0 && empIds[j]>key) {
                empIds[j+1] = empIds[j];
                j--;
            }

            //Place key at correct position
            empIds[j+1] = key;
        }

        //Display sorted employee IDs
        System.out.println("Sorted Employee IDs:");
        for(int id:empIds){
            System.out.print(id + " ");
        }
    }
}
