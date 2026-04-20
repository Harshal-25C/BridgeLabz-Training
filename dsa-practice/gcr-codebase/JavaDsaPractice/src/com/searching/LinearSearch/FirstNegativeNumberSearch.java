package com.searching.LinearSearch;

public class FirstNegativeNumberSearch {
	public static int findFirstNegative(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < 0){
                return i;  //return index of first negative number
            }
        }
        return -1;  //no negative number found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, -3, 6, -7};

        int result = findFirstNegative(numbers);

        if(result != -1){
            System.out.println("First negative number found at index: " + result);
        }else{
            System.out.println("No negative number found");
        }
    }

}
