package com.design.principles.demo.DecoratorPattern;

import com.design.principles.demo.DecoratorPattern.model.Beverage.Beverage;
import com.design.principles.demo.DecoratorPattern.model.Beverage.DarkRoast;
import com.design.principles.demo.DecoratorPattern.model.Beverage.HouseBlend;
import com.design.principles.demo.DecoratorPattern.model.condiment.Milk;
import com.design.principles.demo.DecoratorPattern.model.condiment.Mocha;
import com.design.principles.demo.DecoratorPattern.model.condiment.Soy;

public class CafeShow {
    public static void main(String[] args) {

            Beverage beverage = new HouseBlend();
            beverage = new Milk(beverage);
            beverage = new Mocha(beverage);
            beverage = new Soy(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.getCost());
    }
}
