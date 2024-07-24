package com.assignment3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Question {
    private static final Logger logger = LogManager.getLogger(Question.class);

    private String question, answer;
    private Options options;
    
    public Question(String question, String answer, Options options) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Question [question=" + question + ", answer=" + answer + ", options=" + options + "]";
    }

    public static Question toQuestion(JSONObject jsonObject) {
        String question = (String) jsonObject.get("question");
        Options options = Options.toOptions((JSONArray) jsonObject.get("options"));
        String answer = (String) jsonObject.get("answer");

        logger.debug("Converting JSONObject to Question object.");
        return new Question(question, answer, options);
    }

    @SuppressWarnings("unchecked")
    public JSONObject toJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("question", this.question);
        jsonObject.put("options", this.options.toJSONArray());
        jsonObject.put("answer", this.answer);

        logger.debug("Converting Question object to JSONObject.");
        return jsonObject;
    }
}
