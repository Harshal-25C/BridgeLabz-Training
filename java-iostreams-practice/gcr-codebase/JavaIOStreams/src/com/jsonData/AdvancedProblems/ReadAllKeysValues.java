package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadAllKeysValues {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("src/com/jsonData/AdvancedProblems/students.json"));

        Iterator<Map.Entry<String, JsonNode>> fields = root.fields();

        while(fields.hasNext()) {
            Map.Entry<String, JsonNode> entry = fields.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
