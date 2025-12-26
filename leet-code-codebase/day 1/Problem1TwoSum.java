import java.util.*;

class Problem1TwoSum{
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
	
	public static void main(String[] args){  
	    int[] nums = {2,7,11,15};
		int target = 9;
		
		Problem1TwoSum lt = new Problem1TwoSum();
		int[] arr = lt.twoSum(nums, target);
		
		System.out.println("Indexes is: ");
		for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
	}
}