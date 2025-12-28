class Problem35{
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] >= target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
	
	public static void main(String[] args){
	    int[] nums = {1,3,5,6};
		int target = 5;
		
		int result = searchInsert(nums, target);
		System.out.println("Target is on index "+result);
	}
}