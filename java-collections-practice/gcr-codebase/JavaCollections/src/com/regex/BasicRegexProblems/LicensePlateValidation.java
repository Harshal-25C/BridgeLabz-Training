package com.regex.BasicRegexProblems;

// Starts with two uppercase letters
// Followed by four digits
// Total length = 6 characters

// License plate regex enforces strict format using fixed quantifiers.
public class LicensePlateValidation {
    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345"};

        String regex = "^[A-Z]{2}[0-9]{4}$"; //Validate a License Plate Number

        for(String plate : plates) {
            if(plate.matches(regex)) {
                System.out.println(plate + " → Valid");
            }else {
                System.out.println(plate + " → Invalid");
            }
        }
    }
}
