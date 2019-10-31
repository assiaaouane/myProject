package com.mycalorielibrary.demo.model;

public class Meal {

    private int id;
    private String name;
    private int nutritionalValue;

    public Meal(int id, String name, int nutritionalValue) {
        this.id = id;
        this.name = name;
        this.nutritionalValue = nutritionalValue;
    }
    public Meal() {

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

    public int getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nutritionalValue=" + nutritionalValue +
                '}';
    }
}

