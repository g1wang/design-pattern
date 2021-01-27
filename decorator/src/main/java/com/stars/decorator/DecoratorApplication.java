package com.stars.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);
        Beverage beverage = new Coffee();
        System.out.println(beverage.getPrice());
        System.out.println(beverage.getDescribe());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getPrice());
        System.out.println(beverage.getDescribe());
    }

}
