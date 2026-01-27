package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class JSONtoXML {
    public static void main(String[] args) throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        //Read JSON
        JsonNode jsonNode = jsonMapper.readTree(new File("src/com/jsonData/AdvancedProblems/data.json"));

        //Convert to XML
        String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

        System.out.println("Converted XML:\n" + xml);
    }
}
