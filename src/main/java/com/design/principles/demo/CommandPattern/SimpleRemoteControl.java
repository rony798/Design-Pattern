package com.design.principles.demo.CommandPattern;

import com.design.principles.demo.CommandPattern.command.model.Command;
import com.design.principles.demo.CommandPattern.command.model.LightOnCommand;
import com.design.principles.demo.CommandPattern.vendor.model.Light;
import com.design.principles.demo.CommandPattern.vendor.model.Vendor;

import java.util.List;

public class SimpleRemoteControl {

    private List<Command> onCommandList;
    private List<Command> offCommandList;

    public SimpleRemoteControl(List<Command> onCommandList, List<Command> offCommandList) {
        this.onCommandList = onCommandList;
        this.offCommandList = offCommandList;
    }

    public void onButtonPressed(int index) {
        this.onCommandList.get(index).execute();
    }

    public void offButtonPressed(int index) {
        this.offCommandList.get(index).execute();
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("------------- Simple Remote Controller -------------");
        for(int i = 0;i < onCommandList.size(); i ++) {
            str.append("slot["+(i+1) +"] is "+onCommandList.get(i).getClass().getName());
            str.append("slot["+(i+1) +"] is "+offCommandList.get(i).getClass().getName());
        }

        return str.toString();
    }
}
