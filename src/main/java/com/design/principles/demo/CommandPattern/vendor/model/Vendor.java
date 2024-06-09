package com.design.principles.demo.CommandPattern.vendor.model;

public abstract class Vendor {

    protected String name;

    public Vendor(String name) {
        this.name = name;
    }

    public abstract void on();

    public abstract void off();
}
