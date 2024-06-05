package com.design.principles.demo.StrategyPattern;

import com.design.principles.demo.StrategyPattern.behaviour.FlyBehaviour;
import com.design.principles.demo.StrategyPattern.behaviour.QuackBehaviour;
import com.design.principles.demo.StrategyPattern.behaviour.impl.FlyNoWay;
import com.design.principles.demo.StrategyPattern.behaviour.impl.FlyWithWings;
import com.design.principles.demo.StrategyPattern.behaviour.impl.NoQuack;
import com.design.principles.demo.StrategyPattern.behaviour.impl.Quack;
import com.design.principles.demo.StrategyPattern.model.Duck;
import com.design.principles.demo.StrategyPattern.model.MallardDuck;
import com.design.principles.demo.StrategyPattern.model.WoodenDuck;

import java.util.List;

public class DuckShow {
    public static void main(String[] args) {


        FlyBehaviour flyWithWings = new FlyWithWings();
        QuackBehaviour quack= new Quack();

        FlyBehaviour flyNoWay= new FlyNoWay();
        QuackBehaviour noQuack= new NoQuack();

        Duck mallardDuck = new MallardDuck(flyWithWings, quack);
        Duck woodenDuck= new WoodenDuck(flyNoWay, noQuack);

        List<Duck> duckList = List.of(mallardDuck, woodenDuck);

        duckList.stream().forEach(duck -> {
            duck.display();
            duck.performFly();
            duck.performQuack();
            System.out.println("--------------------");
        });


    }
}
