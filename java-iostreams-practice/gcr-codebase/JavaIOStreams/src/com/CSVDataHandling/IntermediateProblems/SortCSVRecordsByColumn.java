package com.CSVDataHandling.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortCSVRecordsByColumn {
    public static void main(String[] args) {

        String filePath ="src/com/CSVDataHandling/IntermediateProblems/employees.csv";
        List<String[]> records = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            String line;

            while((line = br.readLine()) != null) {
                records.add(line.split(","));
            }

            records.sort((a, b) ->
                Integer.parseInt(b[3]) - Integer.parseInt(a[3])
            );

            System.out.println("Top 5 Highest Paid Employees:");
            for(int i=0; i<Math.min(5, records.size()); i++) {
                String[] emp = records.get(i);
                System.out.println(emp[1] + " | " + emp[2] + " | Salary: " + emp[3]);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
