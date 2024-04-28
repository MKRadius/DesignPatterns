package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        APIFacade apiFacade = new APIFacade();
        String urlString = "https://api.chucknorris.io/jokes/random";
        String attributeName = "value";

        // String urlString = "https://api.fxratesapi.com/latest";
        // String attributeName = "rates";

        try {
            String res = apiFacade.getAttributeValueFromJson(urlString, attributeName);
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error making HTTP request: " + e.getMessage());
        }
    }
}