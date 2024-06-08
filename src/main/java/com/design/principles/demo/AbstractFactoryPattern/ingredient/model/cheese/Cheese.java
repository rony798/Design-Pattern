package com.design.principles.demo.AbstractFactoryPattern.ingredient.model.cheese;

public abstract class Cheese {
    protected  String name;
    protected float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
