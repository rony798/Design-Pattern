package com.design.principles.demo.FactoryPattern.pizza.chicagopizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        this.description = "Chicago Style Pepperoni Pizza";
        this.dough = "Chicago thick crust dough";
        this.sauce = "Chicago mayonee sauce";
        this.price = 219;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
