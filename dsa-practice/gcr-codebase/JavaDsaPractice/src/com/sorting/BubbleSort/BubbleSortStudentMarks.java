package com.sorting.BubbleSort;

public class BubbleSortStudentMarks {

    public static void main(String[] args) {

        int[] marks = {78, 45, 89, 62, 55};

        //Bubble Sort logic
        for(int i=0; i<marks.length-1; i++) {
            for(int j=0; j<marks.length-1-i; j++) {

                //Compare adjacent elements
                if(marks[j] > marks[j+1]){
                    //Swap if they are in wrong order
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                }
            }
        }

        //Display sorted marks
        System.out.println("Sorted Student Marks:");
        for(int mark:marks){
            System.out.print(mark + " ");
        }
    }
}
