package com.design.principles.demo.AdapterPattern;

import com.design.principles.demo.AdapterPattern.duck.model.Duck;
import com.design.principles.demo.AdapterPattern.turkey.model.Turkey;
import com.design.principles.demo.AdapterPattern.turkey.model.WildTurkey;

public class AdapterPatternTest {

    public static void main(String[] args) {

        Turkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);

        duck.fly();
        duck.quack();
    }
}
