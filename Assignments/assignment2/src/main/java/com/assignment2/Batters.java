package com.assignment2;

import org.json.simple.JSONObject;

public class Batters {
    private Batter batter;

    public Batters(Batter batter) {
        this.batter = batter;
    }

    public Batter getBatter() {
        return batter;
    }

    public void setBatter(Batter batter) {
        this.batter = batter;
    }

    @Override
    public String toString() {
        return "Batters [batter=" + batter + "]";
    }

    public static Batters toBatters(JSONObject jsonObject) {
        Batter batter = Batter.toBatter(jsonObject);

        return new Batters(batter);
    }
}
