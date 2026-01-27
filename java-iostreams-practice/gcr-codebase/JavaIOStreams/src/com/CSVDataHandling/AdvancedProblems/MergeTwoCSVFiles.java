package com.CSVDataHandling.AdvancedProblems;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCSVFiles {
    public static void main(String[] args) {

        Map<String, String> marksMap = new HashMap<>();

        try(BufferedReader br2 = new BufferedReader(new FileReader("src/com/CSVDataHandling/AdvancedProblems/students.csv"))) {
            br2.readLine(); // skip header
            String line;

            while((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                marksMap.put(data[0], data[1] + "," + data[2]);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        try(
            BufferedReader br1 = new BufferedReader(new FileReader("src/com/CSVDataHandling/AdvancedProblems/users.csv"));
            FileWriter writer = new FileWriter("src/com/CSVDataHandling/AdvancedProblems/merged_students.csv")
        ) {
            writer.write("ID,Name,Email,Phone,Age,Marks\n");
            br1.readLine(); // skip header
            String line;

            while((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                String extra = marksMap.get(data[0]);

                if(extra != null) {
                    writer.write(line + "," + extra + "\n");
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("CSV files merged successfully.");
    }
}
