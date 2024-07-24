package com.assignment2;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("/home/osiuser/Downloads/OSI Training/Nagarjuna Class Tutorials/Assignments/assignment2/src/main/java/com/assignment2/jsonFile/items.json"));

            Menu menu = Menu.toMenu(jsonObject);
            System.out.println(menu);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}