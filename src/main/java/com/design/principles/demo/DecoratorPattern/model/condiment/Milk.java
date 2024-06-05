package com.design.principles.demo.DecoratorPattern.model.condiment;

import com.design.principles.demo.DecoratorPattern.model.Beverage.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "Milk added !! ->";
    }

    @Override
    public float getCost() {
        return this.beverage.getCost() + 20f;
    }
}
