package com.stars.decorator;

public class Mocha extends BeverageDecorator {

    Beverage beverage;

    private String describe = "mocha";
    private double price = 2.0;


    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescribe() {
        return beverage.getDescribe()+"+"+this.describe;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice()+this.price;
    }
}
