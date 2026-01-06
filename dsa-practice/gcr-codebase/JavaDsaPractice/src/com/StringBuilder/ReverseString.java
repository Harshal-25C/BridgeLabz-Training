package com.StringBuilder;
import java.util.*;

public class ReverseString{

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter any String: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(input);

        sb.reverse();

        String result = sb.toString();
        System.out.println("Reversed String: "+result);
        
        sc.close();
    }
}
