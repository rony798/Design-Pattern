package com.design.principles.demo.FactoryPattern.store.simple;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;
import com.design.principles.demo.FactoryPattern.pizza.simplepizza.CheesePizza;
import com.design.principles.demo.FactoryPattern.pizza.simplepizza.ClamPizza;
import com.design.principles.demo.FactoryPattern.pizza.simplepizza.PepperoniPizza;
import com.design.principles.demo.FactoryPattern.pizza.simplepizza.VeggiePizza;
import com.design.principles.demo.FactoryPattern.store.PizzaStore;

public class SimplePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("CHEESE")) {
            return new CheesePizza();
        } else if(type.equalsIgnoreCase("PEPPERONI")) {
            return new PepperoniPizza();
        } else if(type.equalsIgnoreCase("CLAM")) {
            return new ClamPizza();
        } else if(type.equalsIgnoreCase("VEGGIE")) {
            return new VeggiePizza();
        }
        return null;
    }
}
