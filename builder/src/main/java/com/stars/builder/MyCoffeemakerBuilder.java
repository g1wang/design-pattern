package com.stars.builder;

public class MyCoffeemakerBuilder implements CoffeeMakerBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine("my engine");
    }

    @Override
    public Grinder buildGrinder() {
        return new Grinder("my grinder");
    }
}
