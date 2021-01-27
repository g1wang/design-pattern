package com.stars.abstractfactory;

public class XACoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee productA() {
        return new Coffee("XAA");
    }

    @Override
    public Coffee productB() {
        return new Coffee("XAB");
    }
}
