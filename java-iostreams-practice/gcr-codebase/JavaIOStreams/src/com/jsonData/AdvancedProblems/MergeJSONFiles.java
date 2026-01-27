package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeJSONFiles {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON files
        JsonNode json1 = mapper.readTree(new File("src/com/jsonData/AdvancedProblems/students.json"));
        JsonNode json2 = mapper.readTree(new File("src/com/jsonData/AdvancedProblems/users.json"));

        // Merge json2 into json1
        ObjectNode merged = ((ObjectNode) json1).deepCopy();
        json2.fields().forEachRemaining(entry -> merged.set(entry.getKey(), entry.getValue()));

        // Write merged JSON to file
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("src/com/jsonData/AdvancedProblems/merged.json"), merged);

        System.out.println("JSON files merged successfully");
    }
}
