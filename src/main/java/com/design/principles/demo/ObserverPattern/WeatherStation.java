package com.design.principles.demo.ObserverPattern;

import com.design.principles.demo.ObserverPattern.model.CurrentConditionalDislay;
import com.design.principles.demo.ObserverPattern.model.Observer;
import com.design.principles.demo.ObserverPattern.model.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentObserver = new CurrentConditionalDislay(weatherData);
        weatherData.setMeasure(20f,30f,40f);


    }
}
