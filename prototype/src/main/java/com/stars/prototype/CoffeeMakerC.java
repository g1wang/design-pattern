package com.stars.prototype;

public class CoffeeMakerC implements Cloneable {
    private CoffeeC coffee;
    private String name;

    public CoffeeMakerC(CoffeeC coffee, String name) {
        this.coffee = coffee;
        this.name = name;
    }

    public CoffeeC getCoffee() {
        return coffee;
    }

    public void setCoffee(CoffeeC coffee) {
        this.coffee = coffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
