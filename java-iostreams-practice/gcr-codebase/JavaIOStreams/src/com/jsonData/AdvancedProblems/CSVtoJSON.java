package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVtoJSON {
    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader("src/com/jsonData/AdvancedProblems/students.csv"));
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode jsonArray = mapper.createArrayNode();

        String[] headers = reader.readNext(); // First row = headers
        String[] row;
        while ((row = reader.readNext()) != null) {
            ObjectNode obj = mapper.createObjectNode();
            for (int i = 0; i < headers.length; i++) {
                obj.put(headers[i], row[i]);
            }
            jsonArray.add(obj);
        }
        reader.close();

        // Print JSON
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray));
    }
}
