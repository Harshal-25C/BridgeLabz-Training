package com.regex.ExtractionRegexProblems;
import java.util.regex.*;

/*
 * 💡 Explanation of regex:   \b\d{2}/\d{2}/\d{4}\b
 *  
 *  \d{2} → day
 *  / → separator
 *  \d{2} → month
 *  / → separator
 *  \d{4} → year

*/
public class ExtractDates {
    public static void main(String[] args) {

        String text = "The events are scheduled for 12/05/2023, 25/10/2005, 15/08/2024, and 29/02/2020.";

        //Regex for date format dd/mm/yyyy
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
