package com.regex.AdvancedRegexProblems;

/* Rules:
 * Visa: Starts with 4, total 16 digits
 * MasterCard: Starts with 5, total 16 digits
 * 
 * Explanation of ^(4\d{15}|5\d{15})$
          
          4\d{15} → Visa (starts with 4)
          5\d{15} → MasterCard (starts with 5)
          | → OR
          ^ and $ → full string match
 */

public class CreditCardValidation {
    public static void main(String[] args) {

        String[] cards = {
            "4123456789012345", // Visa
            "5123456789012345", // MasterCard
            "6123456789012345"  // Invalid
        };

        // Regex for Visa and MasterCard
        String regex = "^(4\\d{15}|5\\d{15})$";

        for(String card : cards) {
            if(card.matches(regex)) {
                System.out.println(card + " → Valid Card");
            }else {
                System.out.println(card + " → Invalid Card");
            }
        }
    }
}
