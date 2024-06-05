package com.design.principles.demo.ObserverPattern;

import com.design.principles.demo.ObserverPattern.model.CurrentConditionalDisplay;
import com.design.principles.demo.ObserverPattern.model.Observer;
import com.design.principles.demo.ObserverPattern.model.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentObserver = new CurrentConditionalDisplay(weatherData);
        weatherData.setMeasure(20f,30f,40f);


    }
}
