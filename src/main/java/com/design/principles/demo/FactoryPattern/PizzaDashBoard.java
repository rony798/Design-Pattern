package com.design.principles.demo.FactoryPattern;

import com.design.principles.demo.FactoryPattern.pizza.Pizza;
import com.design.principles.demo.FactoryPattern.store.PizzaStore;
import com.design.principles.demo.FactoryPattern.store.newyork.NewYorkPizzaStore;
import com.design.principles.demo.FactoryPattern.store.simple.SimplePizzaStore;

public class PizzaDashBoard {
    public static void main(String[] args) {
        PizzaStore simplePizzaStore = new SimplePizzaStore();
        Pizza veggiePizza = simplePizzaStore.preparePizza("veggie");
        System.out.println(veggiePizza.getDescription() + "cost "+ veggiePizza.getCost());

        System.out.println(" -------------------------------------------------------");

        PizzaStore nyPizzaStore = new NewYorkPizzaStore();
        Pizza nyPizza = nyPizzaStore.preparePizza("Cheese");
        System.out.println(nyPizza.getDescription() + "cost "+ nyPizza.getCost());

    }
}
