package com.design.principles.demo.AbstractFactoryPattern;

import com.design.principles.demo.AbstractFactoryPattern.factory.Factory;
import com.design.principles.demo.AbstractFactoryPattern.factory.FactoryService;
import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.Pizza;

public class PIzzaCafe {

    public static void main(String[] args) {
        FactoryService service = new FactoryService();
        Factory factory = service.getFactory("newyork");
        Pizza pizza = factory.getPizza("veggie");

        System.out.println(pizza.getCost());
    }
}
