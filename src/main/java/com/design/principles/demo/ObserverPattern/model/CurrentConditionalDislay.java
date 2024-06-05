package com.design.principles.demo.ObserverPattern.model;

public class CurrentConditionalDislay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionalDislay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("------------- Current conditional display ------------------");
        System.out.println("Temperature : "+ this.temperature + " humidity :"+this.humidity+ " pressure :"+ this.pressure);
    }
}
