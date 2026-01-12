package com.day1;
import java.util.*;

class Problem71{
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
	
	public static void main(String[] args){
	    int[] nums = {2,0,2,1,1,0};
		
		sortColors(nums);
		
		System.out.println("Sorted Array: ");
		for(int i=0; i<nums.length; i++){ 
		    System.out.print(nums[i]);
		}
	}
}
