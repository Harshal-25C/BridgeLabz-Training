class Problem26{
    public static int removeDuplicates(int[] nums){

        int cnt =1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
	
	public static void main(String[] args){
	    int[] nums = {3,2,2,3};
		
		int result = removeDuplicates(nums);
		System.out.println("Elements is: "+ result);
	}
}