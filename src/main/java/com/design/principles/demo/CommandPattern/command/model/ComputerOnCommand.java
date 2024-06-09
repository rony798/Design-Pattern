package com.design.principles.demo.CommandPattern.command.model;

import com.design.principles.demo.CommandPattern.vendor.model.Vendor;

public class ComputerOnCommand extends Command{

    private Vendor vendor;

    public ComputerOnCommand(Vendor vendor) {
        this.vendor = vendor;
    }
    @Override
    public void execute() {
        this.vendor.on();
    }
}
