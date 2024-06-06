package com.design.principles.demo.FactoryPattern.pizza.neyworkpizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.description = "New York Style Veggie Pizza";
        this.dough = "NY thin crust dough";
        this.sauce = "NY marinara sauce";
        this.price = 250;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
