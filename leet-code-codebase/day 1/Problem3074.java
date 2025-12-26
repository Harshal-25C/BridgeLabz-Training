import java.util.*;

class Problem3074{
    public int minimumBoxes(int[] apple, int[] capacity){
        int appleSum = 0;
        for(int i=0; i<apple.length; i++){
            appleSum += apple[i];
        }

        Arrays.sort(capacity);
        int i=capacity.length-1, count=0;
        while(appleSum > 0){
            count++;
            appleSum -= capacity[i];
            i--;
        }
        return count;
    }
	
	public static void main(String[] args){
	    //Initialize two arrays apple and capacity
		int[] apple = {1, 3, 2};
		int[] capacity = {4, 3, 1, 5, 2};
		
		//Create an object of a class Problem3074
		Problem3074 lt = new Problem3074();
		
		//Access the method minimumBoxes through object lt
		int result = lt.minimumBoxes(apple, capacity);
		System.out.println("Minimum number of boxes is: "+result);
	}
}