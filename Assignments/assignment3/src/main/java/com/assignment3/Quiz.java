package com.assignment3;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;

public class Quiz {
    private static final Logger logger = LogManager.getLogger(Quiz.class);

    Map<String, Subject> map;

    public Quiz() {
        map = new LinkedHashMap<>();
    }

    public Quiz(Map<String, Subject> map) {
        this.map = map;
    }

    public Map<String, Subject> getMap() {
        return map;
    }

    public void setMap(Map<String, Subject> map) {
        this.map = map;
    }

    public void addSubject(String name, Subject subject) {
        map.put(name, subject);
        logger.debug("Added subject '{}' to quiz.", name);
    }

    public Subject getSubject(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return "Quiz [quiz=" + map + "]";
    }

    public static Quiz toQuiz(JSONObject jsonObject) {
        Map<String, Subject> map = new LinkedHashMap<>();
        for(Object key : jsonObject.keySet()) {
            map.put((String) key, Subject.toSubject((JSONObject) jsonObject.get(key)));
        }
        logger.debug("Converted JSONObject to Quiz object.");
        return new Quiz(map);
    }

    @SuppressWarnings("unchecked")
    public JSONObject toJSONObject() {
        JSONObject jsonObject = new JSONObject();
        for(String key : map.keySet()) {
            jsonObject.put(key, map.get(key).toJSONObject());
        }

        logger.debug("Converted Quiz object to JSONObject.");
        return jsonObject;
    }
}
