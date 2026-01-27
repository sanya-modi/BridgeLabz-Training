package com.jsondata.validateemail;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.networknt.schema.*;

import java.io.File;
import java.util.Set;

public class EmailSchemaValidator {

    public static void main(String[] args) {

        String jsonFile = "C:/Users/modis/OneDrive/Pictures/Documents/employee.json";
        String schemaFile = "C:/Users/modis/OneDrive/Pictures/Documents/output.json";

        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode jsonNode = mapper.readTree(new File(jsonFile));
            JsonNode schemaNode = mapper.readTree(new File(schemaFile));

            JsonSchemaFactory factory =
                    JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

            JsonSchema schema = factory.getSchema(schemaNode);

            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {
                System.out.println("Email field is valid according to schema.");
            } else {
                System.out.println("Validation errors:");
                errors.forEach(e -> System.out.println(e.getMessage()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
