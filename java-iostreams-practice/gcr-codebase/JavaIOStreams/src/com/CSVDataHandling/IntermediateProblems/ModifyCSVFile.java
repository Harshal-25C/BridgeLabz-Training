package com.CSVDataHandling.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSVFile {
    public static void main(String[] args) {

        String inputFile = "src/com/CSVDataHandling/IntermediateProblems/employees.csv";
        String outputFile = "src/com/CSVDataHandling/IntermediateProblems/updated_employees.csv";

        try(
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile)
        ) {
            String line;

            // Write header
            writer.write(br.readLine() + "\n");

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if(data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]);
                    salary = salary + (salary * 0.10);
                    data[3] = String.valueOf((int) salary);
                }

                writer.write(String.join(",", data) + "\n");
            }

            System.out.println("Updated CSV created successfully.");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
