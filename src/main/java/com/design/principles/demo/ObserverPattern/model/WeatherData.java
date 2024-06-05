package com.design.principles.demo.ObserverPattern.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObsberver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        observerList.stream().forEach(observer -> observer.update(temperature, humidity,pressure));
    }

    public void setMeasure(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
