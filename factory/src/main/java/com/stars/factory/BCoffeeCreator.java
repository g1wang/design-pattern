package com.stars.factory;

public class BCoffeeCreator extends CoffeeCreator {
    @Override
    public Coffee createCoffee() {
        Coffee coffee = new BCoffee("B");
        return coffee;

    }
}
