package com.regex.AdvancedRegexProblems;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        // Regex for extracting currency values
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

/*  💡 Explanation: 
 *     \$? → optional dollar symbol
 *     \d+ → one or more digits
 *     \. → decimal point
 *     \d{2} → exactly two decimal digits    */