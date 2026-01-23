package com.JUnit.AdvancedJUnitPrograms.TestingDateFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    //Convert yyyy-MM-dd to dd-MM-yyyy
    public static String formatDate(String inputDate) {
        if(inputDate == null) {
            return null; // handle null input
        }

        try{
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }catch(DateTimeParseException e) {
            return null; //invalid date format
        }
    }
}
