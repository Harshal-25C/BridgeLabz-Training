package com.CSVDataHandling.AdvancedProblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesCSV {
    public static void main(String[] args) {

        String filePath = "src/com/CSVDataHandling/AdvancedProblems/students.csv";
        Set<String> seenIds = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            String line;

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if(!seenIds.add(id)) {
                    System.out.println("Duplicate Record Found → " + line);
                }
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
