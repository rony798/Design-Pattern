package com.design.principles.demo.AbstractFactoryPattern.ingredient.model;

import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.cheese.Cheese;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.clam.Clam;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.dough.Dough;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.pepperoni.Pepperoni;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.sauce.Sauce;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.veggie.Veggie;

import java.util.List;

public class SimplePizza extends Pizza{

    public SimplePizza(Dough dough, Sauce sauce, List<Veggie> veggieList, Cheese cheese, Pepperoni pepperoni, Clam clam) {
        this.dough = dough;
        this.sauce = sauce;
        this.veggieList =veggieList;
        this.cheese =cheese;
        this.pepperoni = pepperoni;
        this.clam = clam;
    }

    public SimplePizza() {

    }


    @Override
    public float getCost() {
        return (float) (dough.getPrice() + sauce.getPrice() + veggieList.stream().mapToDouble(Veggie::getPrice).sum() + cheese.getPrice() + pepperoni.getPrice() + clam.getPrice());
    }
}
