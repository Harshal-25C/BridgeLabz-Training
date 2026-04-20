package com.StringBuilder;

import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter any String: ");
        String input = sc.nextLine();


        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(char ch : input.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }

        String result = sb.toString();
        System.out.println("String without duplicates: " + result);
    }
}
