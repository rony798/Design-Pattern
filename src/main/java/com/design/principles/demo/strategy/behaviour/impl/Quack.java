package com.design.principles.demo.strategy.behaviour.impl;

import com.design.principles.demo.strategy.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack!!!");
    }
}
