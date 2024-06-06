package com.design.principles.demo.FactoryPattern.pizza.chicagopizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.description = "Chicago Style Veggie Pizza";
        this.dough = "Chicago thick crust dough";
        this.sauce = "Chicago marinara sauce";
        this.price = 256;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
