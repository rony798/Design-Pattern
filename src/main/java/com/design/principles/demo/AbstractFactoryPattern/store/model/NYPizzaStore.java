package com.design.principles.demo.AbstractFactoryPattern.store.model;

import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.Pizza;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.SimplePizza;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.cheese.MarrianoCheese;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.cheese.ReggianoCheese;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.clam.FreshClam;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.clam.UsedClam;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.dough.ThickCrustDough;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.dough.ThinCrustDough;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.pepperoni.SlicedPepperoni;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.sauce.MarinaraSauce;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.sauce.TomatoSauce;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.veggie.*;

import java.util.List;

public class NYPizzaStore implements PizzaStore{
    @Override
        public Pizza getPizza(String type) {
            try {
                if(type.equalsIgnoreCase("clam")) {
                    Pizza pizza = new SimplePizza(new ThinCrustDough(), new TomatoSauce(), List.of(new Capsicum(), new Tomato(), new Onion(), new Garlic()), new ReggianoCheese(), new SlicedPepperoni(), new FreshClam());
                    pizza.setName("New York Clam Pizza");
                    preparePizza(pizza);
                    return pizza;
                } else if(type.equalsIgnoreCase("veggie")) {
                    Pizza pizza = new SimplePizza(new ThinCrustDough(), new MarinaraSauce(), List.of(new Capsicum(), new Tomato(), new Onion(), new Garlic(), new Mushroom()), new MarrianoCheese(), new SlicedPepperoni(), new UsedClam());
                    pizza.setName("New York Veggie Pizza");
                    preparePizza(pizza);
                    return pizza;
                } else {
                    Exception ex = new RuntimeException("Not compatible with any New york Pizza type");
                    throw ex;
                }
            } catch(Exception ex) {
                System.out.println("Exception while mapping New york pizza");
            }

            return null;
    }

    @Override
    public void preparePizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
