package com.stars.command;

/**
 * 各种都可以来一杯，喝
 */
public class CoffeeLover {

    Command command;

    public CoffeeLover(Command command) {
        this.command = command;
    }

    public void call(){
        this.command.execute();
    }
}
