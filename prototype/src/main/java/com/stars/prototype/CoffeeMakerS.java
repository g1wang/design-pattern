package com.stars.prototype;

import java.io.Serializable;

public class CoffeeMakerS implements Serializable {
    private CoffeeS coffeeS;
    private String name;

    public CoffeeMakerS(CoffeeS coffeeS, String name) {
        this.coffeeS = coffeeS;
        this.name = name;
    }

    public CoffeeS getCoffeeS() {
        return coffeeS;
    }

    public void setCoffeeS(CoffeeS coffeeS) {
        this.coffeeS = coffeeS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
