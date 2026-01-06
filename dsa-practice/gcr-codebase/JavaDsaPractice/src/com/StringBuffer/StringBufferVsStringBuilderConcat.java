package com.StringBuffer;

public class StringBufferVsStringBuilderConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int iterations = 1_000_000;

	    // -------- StringBuffer Test --------
	        StringBuffer stringBuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();

	        for(int i=0; i<iterations; i++) {
	            stringBuffer.append("hello");
	        }

	        long endBuffer = System.nanoTime();
	        long bufferTime = endBuffer - startBuffer;

	    // -------- StringBuilder Test --------
	        StringBuilder stringBuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append("hello");
	        }

	        long endBuilder = System.nanoTime();
	        long builderTime = endBuilder - startBuilder;

	      
	        System.out.println("StringBuffer Time (ns): " + bufferTime);
	        System.out.println("StringBuilder Time (ns): " + builderTime);

	        if(builderTime < bufferTime) {
	            System.out.println("StringBuilder is faster.");
	        }else{
	            System.out.println("StringBuffer is faster.");
	        }
	    }

}
