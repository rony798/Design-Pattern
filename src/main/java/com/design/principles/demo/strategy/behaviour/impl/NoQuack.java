package com.design.principles.demo.strategy.behaviour.impl;

import com.design.principles.demo.strategy.behaviour.QuackBehaviour;

public class NoQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
