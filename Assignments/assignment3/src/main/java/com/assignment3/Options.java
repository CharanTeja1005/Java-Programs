package com.assignment3;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;

public class Options {
    private static final Logger logger = LogManager.getLogger(Options.class);


    private String option1, option2, option3, option4;

    public Options(String option1, String option2, String option3, String option4) {
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    @Override
    public String toString() {
        return "Options [option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4
                + "]";
    }

    public static Options toOptions(JSONArray jsonArray) {
        String option1 = (String) jsonArray.get(0);
        String option2 = (String) jsonArray.get(1);
        String option3 = (String) jsonArray.get(2);
        String option4 = (String) jsonArray.get(3);

        logger.debug("Converting JSONArray to Options object.");
        return new Options(option1, option2, option3, option4);
    }

    @SuppressWarnings("unchecked")
    public JSONArray toJSONArray() {
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(this.option1);
        jsonArray.add(this.option2);
        jsonArray.add(this.option3);
        jsonArray.add(this.option4);

        logger.debug("Converting Options object to JSONArray.");
        return jsonArray;
    }
}
