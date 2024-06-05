package com.design.principles.demo.DecoratorPattern.model.condiment;

import com.design.principles.demo.DecoratorPattern.model.Beverage.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "Mocha added !! ->";
    }

    @Override
    public float getCost() {
        return this.beverage.getCost() + 30f;
    }
}
