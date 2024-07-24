package com.assignment2;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Item {
    private List<ItemObject> items;

    public Item(List<ItemObject> items) {
        this.items = items;
    }

    public List<ItemObject> getItems() {
        return items;
    }

    public void setItems(List<ItemObject> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Item [items=" + items + "]";
    }

    public static Item toItem(JSONObject jsonObject) {
        JSONArray jsonArray = (JSONArray) jsonObject.get("item");
        List<ItemObject> items = new ArrayList<>();
        for(Object item : jsonArray) {
            items.add(ItemObject.toItemObject((JSONObject)item));
        }

        return new Item(items);
    }
}
