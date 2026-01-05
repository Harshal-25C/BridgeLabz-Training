package com.sorting.CountingSort;

public class CountingSortStudentAges{
    public static void main(String[] args){
        //Student ages (10 to 18)
        int[] ages = {15, 12, 14, 10, 18, 12, 16};

        int maxAge = 18;
        int minAge = 10;

        //Count array to store frequency
        int[] count = new int[maxAge+1];

        for(int age:ages){
            count[age]++;
        }

        int index = 0;

        //Rebuild sorted array
        for(int age = minAge; age <= maxAge; age++){
            while(count[age]>0){
                ages[index++] = age;
                count[age]--;
            }
        }

        System.out.println("Sorted Student Ages:");
        for(int age:ages){
            System.out.print(age + " ");
        }
    }
}
