package com.stackandqueue.StockSpanProblem;
import java.util.Stack;

public class StockSpan{

    public static int[] calculateSpan(int[] prices){
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        //First day span is always 1
        span[0] = 1;
        stack.push(0);

        for(int i=1; i<n; i++){
            //Remove elements smaller than current price
            while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]){
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args){
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.print("Stock Span: ");
        for(int s : span){
            System.out.print(s + " ");
        }
    }
}
