package com.design.principles.demo.DecoratorPattern.model.condiment;

import com.design.principles.demo.DecoratorPattern.model.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    public abstract float getCost();
}
