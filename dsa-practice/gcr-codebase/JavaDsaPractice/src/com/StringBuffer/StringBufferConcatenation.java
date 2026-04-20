package com.StringBuffer;

public class StringBufferConcatenation {
    public static void main(String[] args) {

        String[] words = {
            "Welcome", " ", "to", " ", "StringBuffer", " ", "Example"
        };

        StringBuffer buffer = new StringBuffer();

        //Append each string to StringBuffer
        for(String str:words){
            buffer.append(str);
        }

        //Convert to String
        String result = buffer.toString();

        System.out.println("Concatenated String:");
        System.out.println(result);
    }
}
