package com.design.principles.demo.CommandPattern.vendor.model;

public class Computer extends Vendor{


    public Computer(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println(this.name + "got on");
    }

    @Override
    public void off() {
        System.out.println(this.name + "got off");
    }
}
