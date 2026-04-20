package com.hashing.PairWithGivenSumInArray;

import java.util.HashSet;

public class PairWithGivenSum{
    public static boolean hasPair(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();

        for(int num:arr){
            int required = target-num;

            if(set.contains(required)){
                System.out.println("Pair found: " + num + " + " + required + " = " + target);
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        if(!hasPair(arr, target)){
            System.out.println("No pair found");
        }
    }
}
