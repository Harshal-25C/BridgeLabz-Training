package com.TimeAndSpaceComplexity;

public class RecursiveVsIterativeFibonacciComparison {

    //Recursive Fibonacci - O(2^n)
    public static int fibonacciRecursive(int n){
        if(n <= 1)
            return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    //Iterative Fibonacci - O(n)
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for(int i=2; i<=n; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args){
        int n = 30;

        //Recursive Execution
        long startRecursive = System.nanoTime();
        int recursiveResult = fibonacciRecursive(n);
        long endRecursive = System.nanoTime();

        //Iterative Execution
        long startIterative = System.nanoTime();
        int iterativeResult = fibonacciIterative(n);
        long endIterative = System.nanoTime();

        System.out.println("Fibonacci Number (N): " + n);

        System.out.println("\nRecursive Fibonacci Result: " + recursiveResult);
        System.out.println("Time Taken (Recursive): "
                + (endRecursive - startRecursive)/1_000_000.0+" ms");

        System.out.println("\nIterative Fibonacci Result: " + iterativeResult);
        System.out.println("Time Taken (Iterative): "
                + (endIterative - startIterative)/1_000_000.0+" ms");
    }
}
