package com.CSVDataHandling.AdvancedProblems;

import com.fasterxml.jackson.databind.*;
import java.io.FileWriter;

public class JsonToCsv {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new java.io.File("src/com/CSVDataHandling/AdvancedProblems/students.json"));

        FileWriter writer = new FileWriter("src/com/CSVDataHandling/AdvancedProblems/updated_students.csv");
        writer.write("ID,Name,Age,Marks\n");

        for(JsonNode node : root) {
            writer.write(
                node.get("id").asInt() + "," +
                node.get("name").asText() + "," +
                node.get("age").asInt() + "," +
                node.get("marks").asInt() + "\n"
            );
        }

        writer.close();
    }
}
