package com.day2;

import java.util.*;

public class Problem121{
	//function maxProfit to find profit
    public static int maxProfit(int[] prices){
        int maxCur = 0, maxSoFar = 0;
        for(int i=1; i<prices.length; i++){
            maxCur = Math.max(0, maxCur += prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
	
	public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
		
		int result = maxProfit(prices);
		System.out.println("Maximum profit you can achieve: "+result);
    }
}