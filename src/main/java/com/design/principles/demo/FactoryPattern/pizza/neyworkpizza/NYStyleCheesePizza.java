package com.design.principles.demo.FactoryPattern.pizza.neyworkpizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.description = "New York Style Cheese Pizza";
        this.dough = "NY thin crust dough";
        this.sauce = "NY marinara sauce";
        this.price = 210;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
