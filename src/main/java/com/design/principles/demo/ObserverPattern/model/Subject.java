package com.design.principles.demo.ObserverPattern.model;

public interface Subject {

    public void addObserver(Observer o);
    public void removeObsberver(Observer o);
    public void notifyObserver();
}
