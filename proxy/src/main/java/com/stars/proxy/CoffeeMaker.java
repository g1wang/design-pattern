package com.stars.proxy;

public class CoffeeMaker implements BeverageMaker {
    @Override
    public Coffee make() {
        System.out.println("make coffee");
        return new Coffee();
    }

    @Override
    public void show() {
        System.out.println("show coffee");
    }
}
