package com.stars.observer.observer;

import com.stars.observer.subject.Earth;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 * 观察者
 */
public class CosmicObserver implements Observer {
    List<Observable> observables = new ArrayList<Observable>();
    long nativePopulation;
    long alienPopulation;

    public void addObservable(Observable observable) {
        this.observables.add(observable);
    }

    @Override
    public void update(Observable o, Object arg) {

        for (int i = 0; i < observables.size(); i++) {
            if (o instanceof Earth || observables.get(i) instanceof Earth) {
                Earth earth = (Earth) o;
                nativePopulation = earth.getNativePopulation();
                alienPopulation = earth.getAlienPopulation();
                System.out.println(nativePopulation + "n vs a" + alienPopulation);
                break;
            }
        }

    }
}
