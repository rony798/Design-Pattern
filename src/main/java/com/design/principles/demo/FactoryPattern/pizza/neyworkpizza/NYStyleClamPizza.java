package com.design.principles.demo.FactoryPattern.pizza.neyworkpizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        this.description = "New York Style Clam Pizza";
        this.dough = "NY thin crust dough";
        this.sauce = "NY marinara sauce";
        this.price = 180;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
