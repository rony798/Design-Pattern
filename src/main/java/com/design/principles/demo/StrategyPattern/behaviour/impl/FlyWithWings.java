package com.design.principles.demo.StrategyPattern.behaviour.impl;

import com.design.principles.demo.StrategyPattern.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
