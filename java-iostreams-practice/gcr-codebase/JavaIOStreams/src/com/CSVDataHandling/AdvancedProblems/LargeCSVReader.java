package com.CSVDataHandling.AdvancedProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeCSVReader {
    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/AdvancedProblems/large_students.csv";
        int batchSize = 100;
        int totalCount = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath), 8192)) {
            br.readLine(); // skip header
            String line;
            int batchCount = 0;

            while((line = br.readLine()) != null) {
                batchCount++;
                totalCount++;

                if(batchCount == batchSize) {
                    System.out.println("Processed records: " + totalCount);
                    batchCount = 0;
                }
            }

            if(batchCount > 0) {
                System.out.println("Processed records: " + totalCount);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
