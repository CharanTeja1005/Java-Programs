package com.assignment3;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("/home/osiuser/Downloads/OSI Training/Nagarjuna Class Tutorials/Assignments/assignment3/src/main/java/com/assignment3/jsonfile/quiz.json"));

            Quiz quiz = Quiz.toQuiz((JSONObject) jsonObject.get("quiz"));

            Question mathQuestion = new Question("2 * 3 = ?", "6", new Options("4", "5", "6", "7"));
            quiz.getSubject("maths").addQuestion(mathQuestion);

            Question scienceQuestion = new Question("What is water chemical name?", "H20", new Options("N2O", "H20", "He20", "C6H1206"));
            Subject subject = new Subject(scienceQuestion, null, null);
            quiz.addSubject("science", subject);

            JSONObject newJsonObject = new JSONObject();
            newJsonObject.put("quiz", quiz.toJSONObject());
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/osiuser/Downloads/OSI Training/Nagarjuna Class Tutorials/Assignments/assignment3/src/main/java/com/assignment3/jsonfile/output.json"));
            bw.write(newJsonObject.toJSONString());
            bw.close();
            logger.info("Write successful!!!");

        } catch (Exception e) {
            logger.error("Exception occurred: ", e);
        }

        logger.info("Application ended.");
    }
}
