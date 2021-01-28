package com.stars.state;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateApplication {

    public static void main(String[] args) {
        SpringApplication.run(StateApplication.class, args);
        CoffeeMaker coffeeMaker = new CoffeeMaker(new GrindBeans());
        boolean complete =  coffeeMaker.make();
        if (!complete) return;
        coffeeMaker.setCoffeeMakerState(new DropWaterState());
        coffeeMaker.make();
    }

}
