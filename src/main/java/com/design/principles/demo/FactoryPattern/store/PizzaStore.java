package com.design.principles.demo.FactoryPattern.store;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza preparePizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
