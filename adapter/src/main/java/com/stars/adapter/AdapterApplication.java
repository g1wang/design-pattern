package com.stars.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdapterApplication.class, args);

        BeverageMaker beverageMaker = new CoffeeMaker();
        beverageMaker.make();
        beverageMaker = new MilkMakerAdapter(new MilkCook());
        beverageMaker.make();

    }

}
