package com.assignment2;

import org.json.simple.JSONObject;

public class Menu {
    private Items items;

    public Menu(Items items) {
        this.items = items;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menu [items=" + items + "]";
    }

    public static Menu toMenu(JSONObject jsonObject) {
        Items items = Items.toItems(jsonObject);

        return new Menu(items);
    }
}
