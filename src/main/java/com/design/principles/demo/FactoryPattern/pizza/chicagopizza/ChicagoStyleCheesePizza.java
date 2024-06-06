package com.design.principles.demo.FactoryPattern.pizza.chicagopizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.description = "Chicago Style Cheese Pizza";
        this.dough = "Chicago thick crust dough";
        this.sauce = "Chicago marinara sauce";
        this.price = 219;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
