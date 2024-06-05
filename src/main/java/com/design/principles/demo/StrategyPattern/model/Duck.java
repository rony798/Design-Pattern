package com.design.principles.demo.StrategyPattern.model;

import com.design.principles.demo.StrategyPattern.behaviour.FlyBehaviour;
import com.design.principles.demo.StrategyPattern.behaviour.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackbehaviour) {
        this.flyBehaviour =flyBehaviour;
        this.quackBehaviour = quackbehaviour;
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All Ducks float");
    }
}
