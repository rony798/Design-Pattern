package com.design.principles.demo.StrategyPattern.model;

import com.design.principles.demo.StrategyPattern.behaviour.FlyBehaviour;
import com.design.principles.demo.StrategyPattern.behaviour.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck ");
    }
}
