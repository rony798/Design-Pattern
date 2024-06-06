package com.design.principles.demo.FactoryPattern.pizza.simplepizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        this.description = "Pepperoni Pizza";
        this.dough = "Simple thin crust dough";
        this.sauce = "simple tomato sauce";
        this.price = 250;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
