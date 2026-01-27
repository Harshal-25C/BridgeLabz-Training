package com.jsonData.BasicProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class CreateStudentJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Harshal");
        student.put("age", 21);

        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("Cloud");

        student.set("subjects", subjects);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student));
    }
}
