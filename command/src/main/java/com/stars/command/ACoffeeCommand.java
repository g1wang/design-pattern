package com.stars.command;

/**
 * 对coffeemaker做封装
 */
public class ACoffeeCommand implements Command {

    private CoffeeMaker coffeeMaker;

    public ACoffeeCommand(CoffeeMaker coffeeMaker) {
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
