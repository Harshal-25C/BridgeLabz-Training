package com.CSVDataHandling.AdvancedProblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CsvToJson {

    public static void main(String[] args) {

        String csvPath = "src/com/CSVDataHandling/AdvancedProblems/students.csv";
        String jsonPath = "src/com/CSVDataHandling/AdvancedProblems/updated_students.json";

        List<Map<String, String>> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {

            // Read header
            String headerLine = br.readLine();
            if(headerLine == null) {
                System.out.println("CSV file is empty. Conversion aborted.");
                return;
            }

            String[] headers = headerLine.split(",");
            String line;

            //Read data rows
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if(values.length != headers.length) {
                    System.out.println("Skipping invalid row: " + line);
                    continue;
                }

                Map<String, String> row = new LinkedHashMap<>();
                for(int i=0; i<headers.length; i++) {
                    row.put(headers[i].trim(), values[i].trim());
                }
                records.add(row);
            }

            // Write JSON
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonPath), records);

            // Success message
            System.out.println("CSV successfully converted to JSON!");
            System.out.println("Output file: " + jsonPath);
            System.out.println("Total records converted: " + records.size());

        }catch (Exception e) {
            System.out.println("Error occurred during CSV to JSON conversion.");
            e.printStackTrace();
        }
    }
}
