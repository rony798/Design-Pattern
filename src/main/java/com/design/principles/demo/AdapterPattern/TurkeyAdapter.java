package com.design.principles.demo.AdapterPattern;

import com.design.principles.demo.AdapterPattern.duck.model.Duck;
import com.design.principles.demo.AdapterPattern.turkey.model.Turkey;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
