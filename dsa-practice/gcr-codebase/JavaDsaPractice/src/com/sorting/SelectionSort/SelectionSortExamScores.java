package com.sorting.SelectionSort;

public class SelectionSortExamScores {
    public static void main(String[] args){

        //Array storing exam scores
        int[] scores = {78, 45, 89, 62, 90, 55};

        int n = scores.length;

        for(int i=0; i<n-1; i++){

            // Assume current index has minimum value
            int minIndex = i;

            //Find the minimum element in remaining array
            for (int j=i + 1; j<n; j++){
                if (scores[j] < scores[minIndex]){
                    minIndex = j;
                }
            }

            //Swap the found minimum with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for(int score:scores) {
            System.out.print(score + " ");
        }
    }
}
