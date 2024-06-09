package com.design.principles.demo.FacadePattern.model;

public class Tuner {

    private Integer tune;

    public void on() {
        System.out.println("Tuner is started");
    }

    public void off() {
        System.out.println("Tuner is off");
    }

    public void setTuner(Integer tune) {
        this.tune = tune;
        System.out.println("Tuner is set to "+ this.tune);
    }
}
