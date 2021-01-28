package com.stars.state;


/**
 * coffeemaker state
 */
public interface CoffeeMakerState {
    boolean make();
    void show();
}

class  GrindBeans implements  CoffeeMakerState{

    @Override
    public boolean make() {
        System.out.println("GrindBeans...");
        return true;
    }

    @Override
    public void show() {
        System.out.println("GrindBeans");

    }
}

class DropWaterState implements CoffeeMakerState{

    @Override
    public boolean make() {
        System.out.println("DropWater...");
        return true;
    }

    @Override
    public void show() {
        System.out.println("DropWater...");
    }
}
