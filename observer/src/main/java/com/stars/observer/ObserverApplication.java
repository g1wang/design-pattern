package com.stars.observer;

import com.stars.observer.observer.CosmicObserver;
import com.stars.observer.subject.Earth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);
        Earth earth = new Earth();
        Earth earth2 = new Earth();
        CosmicObserver cosmicObserver = new CosmicObserver();
        cosmicObserver.addObservable(earth);
        cosmicObserver.addObservable(earth2);
        earth.addObserver(cosmicObserver);
        earth2.addObserver(cosmicObserver);
        earth.setMeasure(1,1);
        earth.setMeasure(1,2);
        earth.setMeasure(2,3);
        earth2.setMeasure(10,10);
        earth2.setMeasure(10,20);
        earth2.deleteObserver(cosmicObserver);
        earth2.setMeasure(20,30);
    }

}
