package com.assignment2;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ItemObject {
    private String id, type, name;
    private double ppu;
    private Batters batters;
    private List<Topping> toppings;

    public ItemObject(String id, String type, String name, double ppu, Batters batters, List<Topping> toppings) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.ppu = ppu;
        this.batters = batters;
        this.toppings = toppings;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPpu() {
        return ppu;
    }

    public void setPpu(double ppu) {
        this.ppu = ppu;
    }

    public Batters getBatters() {
        return batters;
    }

    public void setBatters(Batters batters) {
        this.batters = batters;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "ItemObject [id=" + id + ", type=" + type + ", name=" + name + ", ppu=" + ppu + ", batters=" + batters
                + ", toppings=" + toppings + "]";
    }

    public static ItemObject toItemObject(JSONObject jsonObject) {
        String id = (String) jsonObject.get("id");
        String type = (String) jsonObject.get("type");
        String name = (String) jsonObject.get("name");
        double ppu = (double) jsonObject.get("ppu");
        Batters batters = Batters.toBatters((JSONObject)jsonObject.get("batters"));
        JSONArray jsonArray = (JSONArray) jsonObject.get("topping");
        List<Topping> toppings = new ArrayList<>();
        for(Object topping : jsonArray) {
            toppings.add(Topping.toTopping((JSONObject) topping));
        }

        return new ItemObject(id, type, name, ppu, batters, toppings);
    }
}
