package com.jsonData.BasicProblems;

import com.fasterxml.jackson.databind.*;

import java.io.File;

public class ReadSpecificFields {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("src/com/jsonData/BasicProblems/students.json"));

        System.out.println("Name  : " + root.get("name").asText());
        System.out.println("Email : " + root.get("email").asText());
    }
}
