package com.assignment2;

import org.json.simple.JSONObject;

public class BatterObject {
    private String id, type;

    public BatterObject(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BatterObject [id=" + id + ", type=" + type + "]";
    }

    public static BatterObject toBatterObject(JSONObject jsonObject) {
        String id = (String) jsonObject.get("id");
        String type = (String) jsonObject.get("type");

        return new BatterObject(id, type);
    }
}
