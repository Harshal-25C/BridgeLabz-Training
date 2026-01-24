package com.regex.AdvancedRegexProblems;

/* Requirement
 * Format: XXX-XX-XXXX
 * Digits only
 * Hyphens must be in correct positions

🔹 Example Inputs:
     123-45-6789 → Valid
     123456789 → Invalid
*/

public class SocialSecurityNumberValidation {
    public static void main(String[] args) {

        String[] inputs = {
            "123-45-6789",
            "123456789"
        };

        // Regex for SSN validation
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        for(String ssn : inputs) {
            if(ssn.matches(regex)) {
                System.out.println(ssn + " is valid");
            }else {
                System.out.println(ssn + " is invalid");
            }
        }
    }
}

/* 💡 Explanation:
 * 
 *     \d{3} → first 3 digits
 *     - → hyphen
 *     \d{2} → next 2 digits
 *     - → hyphen
 *     \d{4} → last 4 digits
 *     ^ and $ → full string match  
 *     
 *     */
