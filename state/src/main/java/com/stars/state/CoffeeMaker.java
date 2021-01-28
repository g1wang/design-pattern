package com.stars.state;

public class CoffeeMaker {

    CoffeeMakerState coffeeMakerState;

    public boolean make(){
        return coffeeMakerState.make();
    }
    public void show(){
        coffeeMakerState.show();
    }

    public CoffeeMaker(CoffeeMakerState coffeeMakerState) {
        this.coffeeMakerState = coffeeMakerState;
    }

    public CoffeeMakerState getCoffeeMakerState() {
        return coffeeMakerState;
    }

    public void setCoffeeMakerState(CoffeeMakerState coffeeMakerState) {
        this.coffeeMakerState = coffeeMakerState;
    }
}
