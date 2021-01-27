package com.stars.command;

/**
 * 对coffeemaker做封装
 * 类比线程池的ExecutorService
 */
public class BCoffeeCommand implements Command {

    //类比线程
    private CoffeeMaker coffeeMaker;

    public BCoffeeCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        this.coffeeMaker.make();
    }

    @Override
    public void undo() {

    }
}
