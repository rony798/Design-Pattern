package com.design.principles.demo.CommandPattern.command.model;

import com.design.principles.demo.CommandPattern.vendor.model.Vendor;

public abstract class Command {

    protected Vendor vendor;

    public abstract void execute();
}
