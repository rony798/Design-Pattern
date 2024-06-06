package com.design.principles.demo.FactoryPattern.pizza.simplepizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        this.description = "Veggie Pizza";
        this.dough = "Simple thin crust dough";
        this.sauce = "simple tomato sauce";
        this.price = 190;
    }

    @Override
    public long getCost() {
        return this.price;
    }
}
