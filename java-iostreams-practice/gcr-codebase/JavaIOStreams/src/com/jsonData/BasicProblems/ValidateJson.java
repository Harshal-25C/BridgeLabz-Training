package com.jsonData.BasicProblems;

import com.fasterxml.jackson.databind.*;

public class ValidateJson {
    public static void main(String[] args) {

        String json = "{ \"name\": \"Harshal\", \"age\": 21 }";
        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.readTree(json);
            System.out.println("✅ Valid JSON");
        }catch (Exception e) {
            System.out.println("❌ Invalid JSON");
        }
    }
}
