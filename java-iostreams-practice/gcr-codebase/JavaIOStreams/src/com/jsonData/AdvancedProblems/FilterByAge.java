package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterByAge {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("src/com/jsonData/AdvancedProblems/users.json"));

        for(JsonNode node : root) {
            JsonNode ageNode = node.get("age");

            if(ageNode != null && ageNode.asInt() > 25) {
                System.out.println(node);
            }
        }
    }
}
