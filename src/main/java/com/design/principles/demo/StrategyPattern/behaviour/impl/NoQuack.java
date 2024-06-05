package com.design.principles.demo.StrategyPattern.behaviour.impl;

import com.design.principles.demo.StrategyPattern.behaviour.QuackBehaviour;

public class NoQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
