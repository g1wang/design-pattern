package com.stars.chain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainApplication.class, args);
        Coffee coffee = new Coffee(COLOR.GREEN);
        AbstractFilter redFilter = new RedFilter("red");
        AbstractFilter blueFilter = new BlueFilter("Blue");
        AbstractFilter endFilter = new EndFilter("end");
        redFilter.setNextFilter(blueFilter);
        blueFilter.setNextFilter(endFilter);
        redFilter.handle(coffee);
    }

}
