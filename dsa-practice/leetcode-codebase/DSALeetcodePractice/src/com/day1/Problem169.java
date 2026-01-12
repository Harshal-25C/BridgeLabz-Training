package com.day1;

import java.util.*;

class Problem169{
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
	
	public static void main(String[] args){
	    int[] nums = {3,2,3};
		
		int result = majorityElement(nums);
		System.out.println("Majority Element is: " +result);
	}
}