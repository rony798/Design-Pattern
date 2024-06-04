package com.design.principles.demo.strategy.model;

import com.design.principles.demo.strategy.behaviour.FlyBehaviour;
import com.design.principles.demo.strategy.behaviour.QuackBehaviour;

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
