package ru.tinkoff.model;

public class Item {

    public Item(String name) {
        this.name = name;
    }

    private String name;

    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
       return name;
    }
}
