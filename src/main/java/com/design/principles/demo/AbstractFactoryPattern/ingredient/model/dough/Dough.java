package com.design.principles.demo.AbstractFactoryPattern.ingredient.model.dough;

public abstract class Dough {
    protected String name;
    protected float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
