package com.design.principles.demo.FactoryPattern.store.newyork;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;
import com.design.principles.demo.FactoryPattern.pizza.neyworkpizza.NYStyleCheesePizza;
import com.design.principles.demo.FactoryPattern.pizza.neyworkpizza.NYStyleClamPizza;
import com.design.principles.demo.FactoryPattern.pizza.neyworkpizza.NYStylePepperoniPizza;
import com.design.principles.demo.FactoryPattern.pizza.neyworkpizza.NYStyleVeggiePizza;
import com.design.principles.demo.FactoryPattern.store.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("CHEESE")) {
            return new NYStyleCheesePizza();
        } else if(type.equalsIgnoreCase("PEPPERONI")) {
            return new NYStylePepperoniPizza();
        } else if(type.equalsIgnoreCase("CLAM")) {
            return new NYStyleClamPizza();
        } else if(type.equalsIgnoreCase("VEGGIE")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
