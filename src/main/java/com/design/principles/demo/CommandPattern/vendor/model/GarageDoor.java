package com.design.principles.demo.CommandPattern.vendor.model;

import com.design.principles.demo.CommandPattern.command.model.Command;

public class GarageDoor extends Vendor {

    public GarageDoor(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println(this.name + "got open");
    }

    @Override
    public void off() {
        System.out.println(this.name + " got closed");
    }
}
