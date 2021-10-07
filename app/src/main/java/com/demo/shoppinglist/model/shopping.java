package com.demo.shoppinglist.model;

public class shopping {
    private int id;
    private String name;
    private String quantity;

    public shopping(int id, String name, String quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public shopping(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public shopping() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
