package com.stars.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);
        CoffeeMakerDirector coffeeMakerDirector = new MyCoffeeMakerDirector(new MyCoffeemakerBuilder());
        CoffeeMaker coffeeMaker =  coffeeMakerDirector.directorCoffeeMaker();
        System.out.println(coffeeMaker.getEngine().getName());
        System.out.println(coffeeMaker.getGrinder().getName());
    }

}
