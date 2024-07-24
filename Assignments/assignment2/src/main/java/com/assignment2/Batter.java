package com.assignment2;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Batter {
    private List<BatterObject> batter;

    public Batter(List<BatterObject> batter) {
        this.batter = batter;
    }

    public List<BatterObject> getBatter() {
        return batter;
    }

    public void setBatter(List<BatterObject> batter) {
        this.batter = batter;
    }

    @Override
    public String toString() {
        return "Batter [batter=" + batter + "]";
    }

    public static Batter toBatter(JSONObject jsonObject) {
        JSONArray jsonArray = (JSONArray) jsonObject.get("batter");
        List<BatterObject> batter = new ArrayList<>();
        for(Object batterObject : jsonArray) {
            batter.add(BatterObject.toBatterObject((JSONObject)batterObject));
        }
        return new Batter(batter);
    }
}
