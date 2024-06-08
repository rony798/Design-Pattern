package com.design.principles.demo.SingletonPattern;

public class SingletonTest {

    public static void main(String[] args) {
       Singleton singleton = Singleton.getSingleton();

        System.out.println(singleton.hashCode());

        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());


        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getChocolateBoiler();
        chocolateBoiler.boil();

        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getChocolateBoiler();
        chocolateBoiler1.fill();
        chocolateBoiler.boil();

        chocolateBoiler1.drain();

    }
}
