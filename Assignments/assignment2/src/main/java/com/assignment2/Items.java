package com.assignment2;

import org.json.simple.JSONObject;

public class Items {
    private Item item;

    public Items(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Items [item=" + item + "]";
    }

    public static Items toItems(JSONObject jsonObject) {
        Item item = Item.toItem((JSONObject)jsonObject.get("items"));
        
        return new Items(item);
    }
}
