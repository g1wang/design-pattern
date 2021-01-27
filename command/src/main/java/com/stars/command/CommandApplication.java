package com.stars.command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class, args);
        Command aCoffeeCommand = new ACoffeeCommand(new CoffeeMaker("A"));
        CoffeeLover coffeeLover1 = new CoffeeLover(aCoffeeCommand);
        coffeeLover1.call();
        Command bCoffeeCommand = new BCoffeeCommand(new CoffeeMaker("B"));
        CoffeeLover coffeeLover2 = new CoffeeLover(bCoffeeCommand);
        coffeeLover2.call();
    }

}
