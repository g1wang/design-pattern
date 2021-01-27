package com.stars.factory;

public class ACoffeeCreator extends CoffeeCreator {
    @Override
    public Coffee createCoffee() {
        Coffee coffee = new ACoffee("A");
        return coffee;
    }
}
