package com.stars.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class, args);
        CoffeeCreator acf = new ACoffeeCreator();
        Coffee ac = acf.createCoffee();
        CoffeeCreator bcf = new BCoffeeCreator();
        Coffee bc = bcf.createCoffee();
        System.out.println("a-level:"+ac.getLevel());
        System.out.println("b-level:"+bc.getLevel());

     }

}
