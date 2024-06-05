package com.design.principles.demo.StrategyPattern.model;

import com.design.principles.demo.StrategyPattern.behaviour.FlyBehaviour;
import com.design.principles.demo.StrategyPattern.behaviour.QuackBehaviour;

public class WoodenDuck extends Duck {

    public WoodenDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Wooden Duck !!");
    }
}
