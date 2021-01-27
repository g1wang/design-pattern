package com.stars.abstractfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractfactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbstractfactoryApplication.class, args);
        CoffeeCreator acf = new ACoffeeCreator(new XMCoffeeFactory());
        Coffee ac = acf.createCoffee();
        CoffeeCreator bcf = new BCoffeeCreator(new XACoffeeFactory());
        Coffee bc = bcf.createCoffee();
        System.out.println("a-level:"+ac.getLevel());
        System.out.println("b-level:"+bc.getLevel());
    }

}
