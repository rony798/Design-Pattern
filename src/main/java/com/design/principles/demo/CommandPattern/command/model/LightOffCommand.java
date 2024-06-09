package com.design.principles.demo.CommandPattern.command.model;

import com.design.principles.demo.CommandPattern.vendor.model.Vendor;

public class LightOffCommand extends Command{

    public LightOffCommand(Vendor vendor) {
        this.vendor = vendor;
    }
    @Override
    public void execute() {
        vendor.off();
    }
}
