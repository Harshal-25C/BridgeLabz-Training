package com.day1;

public class Problem42{
    public static int trap(int[] height) {
        int l = 0, r = height.length-1;
        int leftMax = 0, rightMax = 0, ans=0;

        while(l < r){
            leftMax = Math.max(height[l], leftMax);
            rightMax = Math.max(height[r], rightMax);

            if(leftMax < rightMax){
                ans += leftMax - height[l];
                l++;
            }else{
                ans += rightMax - height[r];
                r--;
            }
        }
        return ans;
    }
	
	public static void main(String[] args){
	    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int result = trap(height);
		System.out.println("Water trapped after raining: "+result);
	}
}