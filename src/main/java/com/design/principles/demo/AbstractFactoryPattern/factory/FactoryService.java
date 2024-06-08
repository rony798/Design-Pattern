package com.design.principles.demo.AbstractFactoryPattern.factory;

import com.design.principles.demo.AbstractFactoryPattern.store.model.ChicagoPizzaStore;
import com.design.principles.demo.AbstractFactoryPattern.store.model.NYPizzaStore;
import com.design.principles.demo.AbstractFactoryPattern.store.model.PizzaStore;
import com.design.principles.demo.AbstractFactoryPattern.store.model.SimplePizzaStore;

public class FactoryService {

    public Factory getFactory(String type) {
        try {
            if (type.equalsIgnoreCase("newYork")) {
                PizzaStore pizzaStore = new NYPizzaStore();
                return new NewYorkFactory(pizzaStore);
            } else if (type.equalsIgnoreCase("chicago")) {
                PizzaStore pizzaStore = new ChicagoPizzaStore();
                return new ChicagoFactory(pizzaStore);
            } else if(type.equalsIgnoreCase("simple")) {
                PizzaStore pizzaStore = new SimplePizzaStore();
                return new SimpleFactory(pizzaStore);
            } else {
                Exception ex = new RuntimeException("No compatible factory found");
                throw ex;
            }
        } catch(Exception ex) {
            System.out.println("Excveption while mampping factory "+ ex.getMessage());
        }
        PizzaStore pizzaStore = new SimplePizzaStore();
        return new SimpleFactory(pizzaStore);
    }
}
