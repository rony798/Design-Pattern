package com.design.principles.demo.AdapterPattern.duck.model;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Mallard Duck Qauck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck Fly!!!");
    }
}
