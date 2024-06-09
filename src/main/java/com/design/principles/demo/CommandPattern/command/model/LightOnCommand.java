package com.design.principles.demo.CommandPattern.command.model;

import com.design.principles.demo.CommandPattern.vendor.model.Vendor;

public class LightOnCommand extends Command{

    public LightOnCommand(Vendor vendor) {
        this.vendor = vendor;
    }
    @Override
    public void execute() {
        vendor.on();
    }
}
