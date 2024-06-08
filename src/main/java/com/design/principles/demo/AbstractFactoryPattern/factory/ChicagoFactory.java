package com.design.principles.demo.AbstractFactoryPattern.factory;

import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.Pizza;
import com.design.principles.demo.AbstractFactoryPattern.store.model.PizzaStore;

public class ChicagoFactory implements Factory{

    private PizzaStore pizzaStore;

    public ChicagoFactory(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    @Override
    public Pizza getPizza(String type) {
        return this.pizzaStore.getPizza(type);
    }
}
