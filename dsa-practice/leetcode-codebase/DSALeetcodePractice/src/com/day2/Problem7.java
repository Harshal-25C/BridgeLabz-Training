package com.day2;

class Problem7{
    public int reverse(int x){
        int sum = 0;

        while(x != 0){
            int dig = x%10;

            if(sum > Integer.MAX_VALUE/10 || sum < Integer.MIN_VALUE/10){
                return 0;
            }
            sum = sum*10+dig;

            x /= 10;
        }
        return sum;
    }
	
	public static void main(String[] args){
	    int x = 123;
		
		//Create object of a class
		Problem7 lt = new Problem7();
		//Acccess method reverse through an object
		int result = lt.reverse(x);
		
		System.out.println("Reversed number of "+x+" is: "+result);
	}
}