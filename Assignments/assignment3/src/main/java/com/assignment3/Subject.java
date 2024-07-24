package com.assignment3;

import org.json.simple.JSONObject;

public class Subject {
    private Question q1, q2, q3;

    public Subject(Question q1, Question q2, Question q3) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    public Question getQ1() {
        return q1;
    }

    public void setQ1(Question q1) {
        this.q1 = q1;
    }

    public Question getQ2() {
        return q2;
    }

    public void setQ2(Question q2) {
        this.q2 = q2;
    }

    public Question getQ3() {
        return q3;
    }

    public void setQ3(Question q3) {
        this.q3 = q3;
    }

    public void addQuestion(Question q) {
        if(q1 == null) q1 = q;
        else if(q2 == null) q2 = q;
        else q3 = q;
    }

    @Override
    public String toString() {
        return "Subject [q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + "]";
    }

    public static Subject toSubject(JSONObject jsonObject) {
        Question q1 = null;
        Question q2 = null;
        Question q3 = null;
        if(jsonObject.get("q1") != null) q1 = Question.toQuestion((JSONObject) jsonObject.get("q1"));
        if(jsonObject.get("q2") != null) q2 = Question.toQuestion((JSONObject) jsonObject.get("q2"));
        if(jsonObject.get("q3") != null) q3 = Question.toQuestion((JSONObject) jsonObject.get("q3"));

        return new Subject(q1, q2, q3);
    }

    @SuppressWarnings("unchecked")
    public JSONObject toJSONObject() {
        JSONObject jsonObject = new JSONObject();
        if(q1 != null) jsonObject.put("q1", q1.toJSONObject());
        if(q2 != null) jsonObject.put("q2", q2.toJSONObject());
        if(q3 != null) jsonObject.put("q3", q3.toJSONObject());

        return jsonObject;
    }
}
