package com.example.charan;

import org.json.JSONObject;

public class JsonTest1 {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Surya");
        jsonObject.put("name", "Charan");
        jsonObject.put("age", 22);
        jsonObject.put("city", "Hyderabad");
        jsonObject.put("state", "Telangana");

        String jsonString = jsonObject.toString();
        System.out.println("JSON Output:");
        System.out.println(jsonString);

        JSONObject parsedJson = new JSONObject(jsonString);
        System.out.println("Name: " + parsedJson.getString("name"));
        System.out.println("Age: " + parsedJson.getInt("age"));
        System.out.println("City: " + parsedJson.getString("city"));
        System.out.println("State: " + parsedJson.getString("state"));
    }
}
