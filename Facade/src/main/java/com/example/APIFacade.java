package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class APIFacade {
    private String getJsonFromApi(String apiUrl) throws IOException {
        @SuppressWarnings("deprecation")
        URL url = new URL(apiUrl);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractValueFromJson(String json, String attributeName) throws IllegalArgumentException {
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            Object value = jsonObject.get(attributeName);
            if (value == null) {
                throw new IllegalArgumentException("Attribute '" + attributeName + "' not found in JSON");
            }
            return value.toString();
        } catch (org.json.simple.parser.ParseException e) {
            throw new IllegalArgumentException("Error parsing JSON: " + e.getMessage());
        }
    }

    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        String jsonResult = getJsonFromApi(urlString);
        return extractValueFromJson(jsonResult, attributeName);
    }
}
