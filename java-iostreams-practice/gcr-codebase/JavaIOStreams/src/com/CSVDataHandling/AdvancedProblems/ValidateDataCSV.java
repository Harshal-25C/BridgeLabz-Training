package com.CSVDataHandling.AdvancedProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateDataCSV {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");

    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/AdvancedProblems/users.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            String line;

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean valid = true;

                if(!EMAIL_PATTERN.matcher(email).matches()) {
                    System.out.println("Invalid Email → " + line);
                    valid = false;
                }

                if(!PHONE_PATTERN.matcher(phone).matches()) {
                    System.out.println("Invalid Phone → " + line);
                    valid = false;
                }

                if(!valid) {
                    System.out.println("❌ Error in row above\n");
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
