package com.stars.proxy;

import java.lang.reflect.Proxy;

public class CoffeeMakerProxy implements BeverageMaker{

    BeverageMaker beverageMaker;

    public CoffeeMakerProxy(CoffeeMaker coffeeMaker) {
        //
        BeverageMakerHandler bh = new BeverageMakerHandler(coffeeMaker);

        this.beverageMaker = (BeverageMaker) Proxy.newProxyInstance(coffeeMaker.getClass().getClassLoader(),
                new Class[]{BeverageMaker.class},bh);
    }

    @Override
    public Coffee make() {
        System.out.println("-before-");
        Coffee coffee = (Coffee) this.beverageMaker.make();
        coffee.setDescribe("proxy");
        System.out.println("-after-");
        return coffee;
    }

    @Override
    public void show() {

    }
}
