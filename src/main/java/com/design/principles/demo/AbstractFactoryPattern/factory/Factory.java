package com.design.principles.demo.AbstractFactoryPattern.factory;

import com.design.principles.demo.AbstractFactoryPattern.ingredient.model.Pizza;

public interface Factory {

    public Pizza getPizza(String type);
}
