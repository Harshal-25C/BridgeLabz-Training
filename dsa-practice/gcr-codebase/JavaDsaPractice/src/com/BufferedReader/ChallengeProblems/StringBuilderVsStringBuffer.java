package com.BufferedReader.ChallengeProblems;

import java.util.*;

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        //StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<iterations; i++){
            sb.append(text);
        }
        long endBuilder = System.nanoTime();

        
        //StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for(int i=0; i<iterations; i++) {
            sbuf.append(text);
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder Time (ms): "+ (endBuilder - startBuilder)/1_000_000);
        System.out.println("StringBuffer Time (ms): "+ (endBuffer - startBuffer)/1_000_000);
    }
}
