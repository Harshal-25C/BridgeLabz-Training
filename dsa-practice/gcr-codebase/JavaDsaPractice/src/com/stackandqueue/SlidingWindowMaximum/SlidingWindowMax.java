package com.stackandqueue.SlidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax{
    public static void printMax(int[] arr, int k){
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0; i<arr.length; i++){

            //Remove indices out of current window
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            //Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.pollLast();
            }

            dq.addLast(i);

            if(i >= k-1){
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.print("Sliding Window Maximum: ");
        printMax(arr, k);
    }
}
