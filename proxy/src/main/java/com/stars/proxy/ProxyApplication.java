package com.stars.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);
        CoffeeMakerProxy coffeeMakerProxy = new CoffeeMakerProxy(new CoffeeMaker());
        Coffee coffee = coffeeMakerProxy.make();
        System.out.println(coffee.getDescribe());

    }

}
