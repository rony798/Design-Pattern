package com.design.principles.demo.FacadePattern.model;

public class Projector {

    public void on() {
        System.out.println("Projector got up");
    }

    public void wideScreenMode() {
        System.out.println("Set projector to wide screenMode");
    }

    public void off() {
        System.out.println("Projector got shutted down");
    }
}
