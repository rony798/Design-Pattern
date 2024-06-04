package com.design.principles.demo.strategy.model;

import com.design.principles.demo.strategy.behaviour.FlyBehaviour;
import com.design.principles.demo.strategy.behaviour.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck ");
    }
}
