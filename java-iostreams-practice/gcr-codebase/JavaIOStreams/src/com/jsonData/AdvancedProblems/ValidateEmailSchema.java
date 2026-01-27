package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.*;
import com.networknt.schema.*;

import java.io.File;
import java.util.Set;

public class ValidateEmailSchema {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode schemaNode = mapper.readTree(new File("src/com/jsonData/AdvancedProblems/schema.json"));
        JsonNode dataNode = mapper.readTree(new File("src/com/jsonData/AdvancedProblems/data.json"));

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
        JsonSchema schema = factory.getSchema(schemaNode);

        Set<ValidationMessage> errors = schema.validate(dataNode);

        if (errors.isEmpty()) {
            System.out.println("✅ Email is valid");
        } else {
            errors.forEach(e -> System.out.println("❌ " + e.getMessage()));
        }
    }
}
