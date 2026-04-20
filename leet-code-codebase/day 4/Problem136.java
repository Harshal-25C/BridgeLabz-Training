class Problem136{
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int hk=0;

        for(int i=0; i<n; i++){
            hk = hk^nums[i];
        }
        return hk;
    }
	
	public static void main(String[] args){
	    int[]  nums = {2,2,1};
		
		int result = singleNumber(nums);
		System.out.println("Unique number is: "+ result);
	}
}