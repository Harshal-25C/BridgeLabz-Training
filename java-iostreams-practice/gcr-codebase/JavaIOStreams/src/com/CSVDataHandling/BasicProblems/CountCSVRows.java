package com.CSVDataHandling.BasicProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/BasicProblems/students.csv";
        int count = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine(); //Skip header
            while(br.readLine() != null) {
                count++;
            }

            System.out.println("Total Records (excluding header): " + count);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
