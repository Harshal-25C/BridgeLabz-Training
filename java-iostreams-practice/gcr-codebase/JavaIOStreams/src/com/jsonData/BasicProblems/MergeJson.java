package com.jsonData.BasicProblems;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Harshal");
        json1.put("age", 21);

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("email", "harshal@gmail.com");
        json2.put("city", "Indore");

        json1.setAll(json2);   //merge

        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                                 .writeValueAsString(json1));
    }
}
