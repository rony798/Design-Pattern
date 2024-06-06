package com.design.principles.demo.FactoryPattern.pizza.chicagopizza;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        this.description = "Chicago Style Clam Pizza";
        this.dough = "Chicago thick crust dough";
        this.sauce = "Chicago meyonee sauce";
        this.price = 189;
    }
    @Override
    public long getCost() {
        return this.price;
    }
}
