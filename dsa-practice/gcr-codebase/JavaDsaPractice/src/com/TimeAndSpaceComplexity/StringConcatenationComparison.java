package com.TimeAndSpaceComplexity;

public class StringConcatenationComparison{
    public static void main(String[] args){

        int N = 100000; // Change to 1_000 / 10_000 / 1_000_000 carefully
        String value = "hello";

        //Using String
        long startString = System.nanoTime();

        String str = "";
        for(int i=0; i<N; i++) {
            str+= value; //creates new object every time
        }

        long endString = System.nanoTime();

        //Using StringBuilder
        long startBuilder = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            sb.append(value); // mutable, fast
        }

        long endBuilder = System.nanoTime();

        //Using StringBuffer
        long startBuffer = System.nanoTime();

        StringBuffer sbf = new StringBuffer();
        for(int i=0; i<N; i++) {
            sbf.append(value); //thread-safe, synchronized
        }

        long endBuffer = System.nanoTime();

        System.out.println("Operations Count (N): " + N);

        System.out.println("\nString Concatenation (O(N²)):");
        System.out.println("Time Taken: " + (endString - startString)/1_000_000.0+" ms");

        System.out.println("\nStringBuilder Concatenation (O(N)):");
        System.out.println("Time Taken: " + (endBuilder - startBuilder)/1_000_000.0+" ms");

        System.out.println("\nStringBuffer Concatenation (O(N)):");
        System.out.println("Time Taken: " + (endBuffer - startBuffer)/1_000_000.0+" ms");
    }
}
