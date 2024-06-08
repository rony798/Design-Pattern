package com.design.principles.demo.AbstractFactoryPattern.ingredient.model;

import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.cheese.Cheese;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.clam.Clam;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.dough.Dough;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.pepperoni.Pepperoni;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.sauce.Sauce;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.veggie.Veggie;

import java.util.List;

public abstract class Pizza {

    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggie> veggieList;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;
    protected String name;

    public void prepare() {
        System.out.println("Used dough"+dough.getName());
        System.out.println("Used sauce "+ sauce.getName());
        veggieList.stream().forEach(veggie -> System.out.println(veggie.getName()));
        System.out.println("Used cheese" + cheese.getName());
        System.out.println("Used Pepperoni "+ pepperoni.getName());
        System.out.println("Used Clam" + clam.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Baking "+ this.name);
    }

    public void cut() {
        System.out.println("Cutting "+ this.name);
    }

    public void box() {
        System.out.println("Boxing "+this.name);
    }

    public abstract float getCost();
}
