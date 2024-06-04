package com.design.principles.demo.strategy.behaviour.impl;

import com.design.principles.demo.strategy.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
