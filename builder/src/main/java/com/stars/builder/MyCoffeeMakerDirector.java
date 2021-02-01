package com.stars.builder;

public class MyCoffeeMakerDirector implements CoffeeMakerDirector {

    private CoffeeMakerBuilder coffeeMakerBuilder;

    public MyCoffeeMakerDirector(CoffeeMakerBuilder coffeeMakerBuild) {
        this.coffeeMakerBuilder = coffeeMakerBuild;
    }

    @Override
    public CoffeeMaker directorCoffeeMaker() {
        Engine engine = coffeeMakerBuilder.buildEngine();
        Grinder grinder = coffeeMakerBuilder.buildGrinder();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.setEngine(engine);
        coffeeMaker.setGrinder(grinder);
        return coffeeMaker;

    }
}
