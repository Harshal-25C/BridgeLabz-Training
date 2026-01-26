package com.CSVDataHandling.BasicProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/BasicProblems/students.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // Skip header

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println("Student ID   : " + data[0]);
                System.out.println("Name         : " + data[1]);
                System.out.println("Age          : " + data[2]);
                System.out.println("Marks        : " + data[3]);
                System.out.println("---------------------------");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
