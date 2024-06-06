package com.design.principles.demo.FactoryPattern.pizza.neyworkpizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        this.description = "New York Style Pepperoni Pizza";
        this.dough = "NY thin crust dough";
        this.sauce = "NY marinara sauce";
        this.price = 210;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
