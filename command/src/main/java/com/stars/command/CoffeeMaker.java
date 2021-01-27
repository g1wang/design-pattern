package com.stars.command;

/**
 * 真正make的人
 */
public class CoffeeMaker {
    String type;

    public CoffeeMaker(String type) {
        this.type = type;
    }

    public void make(){
        System.out.println(type+":---------xxxxxxxxxxxx--------");
    }
}
