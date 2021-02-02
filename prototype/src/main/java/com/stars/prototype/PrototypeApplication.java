package com.stars.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class PrototypeApplication {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        SpringApplication.run(PrototypeApplication.class, args);
        CoffeeC coffee = new CoffeeC("Proto","1");
        CoffeeMakerC coffeeMaker = new CoffeeMakerC(coffee,"Proto Maker");
        //deep copy 深克隆 内部对象同时克隆
        CoffeeMakerC coffeeMakerCDeep = (CoffeeMakerC) coffeeMaker.clone();
        coffeeMakerCDeep.setCoffee((CoffeeC) coffeeMaker.getCoffee().clone());
        coffeeMakerCDeep.getCoffee().setType("obj CDeep Clone");
        System.out.println(coffeeMaker.getCoffee().getType());
        System.out.println(coffeeMakerCDeep.getCoffee().getType());
        //ref copy 浅克隆，对普通变量深克隆，对象变量克隆引用
        CoffeeMakerC coffeeMakerRef = (CoffeeMakerC) coffeeMaker.clone();
        coffeeMakerRef.getCoffee().setType("obj REF");
        System.out.println("coffeeMakerProto:"+coffeeMaker.getCoffee().getType());
        System.out.println("coffeeMakerRef:"+coffeeMakerRef.getCoffee().getType());






        //deep copy 二进制流深克隆
        CoffeeS coffeeS = new CoffeeS("Proto","1");
        CoffeeMakerS coffeeMakerS = new CoffeeMakerS(coffeeS,"Proto Maker");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(coffeeMakerS);
        oos.close();
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        CoffeeMakerS cMakerSDeep = (CoffeeMakerS) ois.readObject();
        ois.close();
        cMakerSDeep.getCoffeeS().setType("obj DEEP");
        System.out.println("coffeeMakerProto:"+coffeeMakerS.getCoffeeS().getType());
        System.out.println("coffeeMakerDeep:"+cMakerSDeep.getCoffeeS().getType());

    }

}
