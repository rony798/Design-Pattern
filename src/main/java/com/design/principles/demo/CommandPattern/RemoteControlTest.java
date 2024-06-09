package com.design.principles.demo.CommandPattern;

import com.design.principles.demo.CommandPattern.command.model.*;
import com.design.principles.demo.CommandPattern.vendor.model.*;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class RemoteControlTest {

    public static void main(String[] args) {
        Vendor light = new Light("Light");
        Vendor door = new GarageDoor("Garage Door");
        Vendor computer = new Computer("Computer");
        Vendor television = new Television("Television");

        Command lightOnCommand = new LightOnCommand(light);
        Command doorOpenCommand = new GarageDoorOpenCommand(door);
        Command computerOnCommand = new ComputerOnCommand(computer);
        Command televisionOnCommand = new TelevisionOnCommand(television);

        Command lightOffCommand = new LightOffCommand(light);
        Command doorCloseCommand = new GarageDoorCloseCommand(door);
        Command computerOffCommand = new ComputerOffCommand(computer);
        Command televisionOffCommand = new TelevisionOffCommand(television);

        List<Command> onCommandList = List.of(lightOnCommand, doorOpenCommand, computerOnCommand, televisionOnCommand);
        List<Command> offCommandList = List.of(lightOffCommand, doorCloseCommand, computerOffCommand, televisionOffCommand);

        SimpleRemoteControl remote = new SimpleRemoteControl(onCommandList, offCommandList);

        System.out.println(remote);
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);

        remote.onButtonPressed(2);
        remote.offButtonPressed(2);

        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
    }
}
