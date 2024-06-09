package com.design.principles.demo.AdapterPattern.turkey.model;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Wild Turkey Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Wild Turkey is flying");
    }
}
