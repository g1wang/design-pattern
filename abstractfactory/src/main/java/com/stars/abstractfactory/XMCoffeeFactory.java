package com.stars.abstractfactory;

public class XMCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee productA() {
        return new Coffee("XMA");
    }

    @Override
    public Coffee productB() {
        return new Coffee("XMB");
    }
}
