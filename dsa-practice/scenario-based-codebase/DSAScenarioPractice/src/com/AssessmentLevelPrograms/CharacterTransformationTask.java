package com.AssessmentLevelPrograms;
import java.util.*;

public class CharacterTransformationTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");

        String str = sc.nextLine();
        int n = str.length();

        if(n < 4) {
            System.out.println("The String " + str + " has less than minimum length");
            return;
        }

        if(str.contains(" ")) {
            System.out.println("The String " + str + " should not contain space");
            return;
        }

        StringBuilder newStr = new StringBuilder();

        for(int i=0; i<n; i++) {
            int ch = str.charAt(i);
            ch = ch-n;
            newStr.append((char) ch);
        }

        System.out.println(newStr.toString());
    }
}
