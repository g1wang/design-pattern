package com.stars.template;

public class CoffeeMaker extends BeverageMaker {


    @Override
    void opt1() {
        System.out.println("- coffee opt1 -");
    }

    @Override
    void opt2() {
        System.out.println("-  coffee opt2  -");
    }

    /**
     * 可重写模板内已实现的方法
     */
    @Override
    void opt3() {
        System.out.println("- coffee opt3 -");
    }
}
