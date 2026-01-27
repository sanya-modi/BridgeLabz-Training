package com.jsondata.readfields;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadSpecificFields {

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            File file = new File(
                "C:/Users/modis/OneDrive/Pictures/Documents/sample.json"
            );

            // Read JSON into tree
            JsonNode rootNode = mapper.readTree(file);

            // Safely extract fields (NO NullPointerException)
            String name = rootNode.path("name").asText("N/A");
            String email = rootNode.path("email").asText("N/A");

            System.out.println("User Name: " + name);
            System.out.println("User Email: " + email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
