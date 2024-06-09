package com.design.principles.demo.CommandPattern.command.model;

import com.design.principles.demo.CommandPattern.vendor.model.Vendor;

public class TelevisionOffCommand extends Command{

    private Vendor vendor;

    public TelevisionOffCommand(Vendor vendor) {
        this.vendor = vendor;
    }
    @Override
    public void execute() {
        this.vendor.off();
    }
}
