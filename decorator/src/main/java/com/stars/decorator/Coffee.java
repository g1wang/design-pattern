package com.stars.decorator;

public class Coffee extends Beverage {

    private String describe = "coffee";
    private double price = 10.0;

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
