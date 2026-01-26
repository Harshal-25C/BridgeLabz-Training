package com.CSVDataHandling.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchRecordInCSV {
    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/IntermediateProblems/employees.csv";
        String searchName = "Harshal";
        boolean found = false;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if(data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary    : " + data[3]);
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("Employee not found.");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
