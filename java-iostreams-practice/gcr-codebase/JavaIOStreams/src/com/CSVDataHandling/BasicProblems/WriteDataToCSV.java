package com.CSVDataHandling.BasicProblems;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToCSV {
    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/BasicProblems/employees.csv";

        try (FileWriter writer = new FileWriter(filePath)) {

            // Write header
            writer.append("ID,Name,Department,Salary\n");

            // Write records
            writer.append("1,Harshal,IT,50000\n");
            writer.append("2,Amit,HR,45000\n");
            writer.append("3,Priya,Finance,60000\n");
            writer.append("4,Rahul,Marketing,48000\n");
            writer.append("5,Neha,Admin,42000\n");

            System.out.println("CSV file written successfully.");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
