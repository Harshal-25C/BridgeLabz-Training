package com.jsonData.BasicProblems;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("src/com/jsonData/BasicProblems/employees.json"));

        for(JsonNode node:root) {
            if(node.get("age").asInt() > 25) {
                System.out.println(node);
            }
        }
    }
}
