package com.AssessmentLevelPrograms;
import java.util.*;

public class StringTransWithPrimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String step3Result = transformString(input);
        System.out.println("After Step 3: " + step3Result);

        String finalResult = insertAtPrimePositions(step3Result, input.charAt(0));
        System.out.println("Final Output: " + finalResult);
    }

    //Step 1–3
    public static String transformString(String str) {

        int n = str.length();
        int mid = n/2;

        String left = str.substring(0, mid);
        String right = str.substring(mid);

        String leftRev = new StringBuilder(left).reverse().toString();
        String rightRev = new StringBuilder(right).reverse().toString();

        StringBuilder result = new StringBuilder();

        int i = 0;
        while(i < leftRev.length() && i < rightRev.length()) {
            result.append(leftRev.charAt(i));
            result.append(rightRev.charAt(i));
            i++;
        }

        if(i < leftRev.length())
            result.append(leftRev.substring(i));

        if(i < rightRev.length())
            result.append(rightRev.substring(i));

        return result.toString();
    }

    //Step 4
    public static String insertAtPrimePositions(String str, char ch) {

        StringBuilder sb = new StringBuilder(str);

        int count = 0;  // tracks how many insertions done

        for(int i=2; i<=sb.length()+count; i++) {
            if(isPrime(i)) {
                int index = i-1;  //convert 1-based to 0-based

                if(index <= sb.length()) {
                    sb.insert(index, ch);
                    count++;
                }
            }
        }

        return sb.toString();
    }

    public static boolean isPrime(int num) {

        if (num <= 1) return false;
        if (num == 2) return true;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }
}