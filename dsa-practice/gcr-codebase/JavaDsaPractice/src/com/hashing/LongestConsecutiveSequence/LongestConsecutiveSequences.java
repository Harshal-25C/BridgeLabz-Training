package com.hashing.LongestConsecutiveSequence;

import java.util.*;

public class LongestConsecutiveSequences{

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num:set){
            //Check if this is the start of a sequence
            if(!set.contains(num-1)){
                int currentNum = num;
                int count = 1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args){
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " +
                longestConsecutive(arr));
    }
}
