package com.design.principles.demo.strategy.behaviour.impl;

import com.design.principles.demo.strategy.behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
