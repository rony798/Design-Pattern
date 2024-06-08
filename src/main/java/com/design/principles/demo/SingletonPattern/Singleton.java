package com.design.principles.demo.SingletonPattern;

public class Singleton{

    public static Singleton singleton;
    private Singleton() {

    }

    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
