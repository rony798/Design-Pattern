package com.design.principles.demo.AbstractFactoryPattern.store.model;

import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.Pizza;

public interface PizzaStore {

    public Pizza getPizza(String type);

    public void preparePizza(Pizza pizza);
}
