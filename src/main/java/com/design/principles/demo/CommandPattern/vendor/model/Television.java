package com.design.principles.demo.CommandPattern.vendor.model;

public class Television extends Vendor{
    public Television(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println(this.name + "got open");
    }

    @Override
    public void off() {
        System.out.println(this.name + "got close");
    }
}
