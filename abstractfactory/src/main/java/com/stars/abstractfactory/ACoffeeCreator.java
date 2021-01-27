package com.stars.abstractfactory;

public class ACoffeeCreator extends CoffeeCreator {

    private CoffeeFactory coffeeFactory;

    public ACoffeeCreator(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    @Override
    public Coffee createCoffee() {
        Coffee coffee = coffeeFactory.productA();
        return coffee;
    }
}
