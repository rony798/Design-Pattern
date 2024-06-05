package com.design.principles.demo.DecoratorPattern.model.condiment;

import com.design.principles.demo.DecoratorPattern.model.Beverage.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "Soy added!! ->";
    }

    @Override
    public float getCost() {
        return this.beverage.getCost() + 19f;
    }
}
