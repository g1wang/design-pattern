package com.stars.abstractfactory;

public class BCoffeeCreator extends CoffeeCreator {

    private CoffeeFactory coffeeFactory;

    public BCoffeeCreator(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    @Override
    public Coffee createCoffee() {
        Coffee coffee = coffeeFactory.productB();
        return coffee;

    }
}
