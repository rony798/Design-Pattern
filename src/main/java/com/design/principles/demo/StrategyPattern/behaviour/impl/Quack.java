package com.design.principles.demo.StrategyPattern.behaviour.impl;

import com.design.principles.demo.StrategyPattern.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack!!!");
    }
}
