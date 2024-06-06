package com.design.principles.demo.FactoryPattern.pizza.simplepizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        this.description = "Clam Pizza";
        this.dough = "Simple thin crust dough";
        this.sauce = "simple tomato sauce";
        this.price = 210;
    }

    @Override
    public long getCost() {
        return this.price;
    }
}
