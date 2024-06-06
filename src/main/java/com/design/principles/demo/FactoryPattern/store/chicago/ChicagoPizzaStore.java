package com.design.principles.demo.FactoryPattern.store.chicago;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;
import com.design.principles.demo.FactoryPattern.pizza.chicagopizza.ChicagoStyleCheesePizza;
import com.design.principles.demo.FactoryPattern.pizza.chicagopizza.ChicagoStyleClamPizza;
import com.design.principles.demo.FactoryPattern.pizza.chicagopizza.ChicagoStylePepperoniPizza;
import com.design.principles.demo.FactoryPattern.pizza.chicagopizza.ChicagoStyleVeggiePizza;
import com.design.principles.demo.FactoryPattern.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("CHEESE")) {
            return new ChicagoStyleCheesePizza();
        } else if(type.equalsIgnoreCase("PEPPERONI")) {
            return new ChicagoStylePepperoniPizza();
        } else if(type.equalsIgnoreCase("CLAM")) {
            return new ChicagoStyleClamPizza();
        } else if(type.equalsIgnoreCase("VEGGIE")) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
