package com.stars.observer.subject;

import java.util.Observable;

/**
 * 受观察者
 */
public class Earth extends Observable {
    long nativePopulation;
    long alienPopulation;

    //观察者拉取数据调用
    public long getNativePopulation() {
        return nativePopulation;
    }
    public long getAlienPopulation() {
        return alienPopulation;
    }


    public void setMeasure(long nativePopulation, long alienPopulation) {
        this.nativePopulation = nativePopulation;
        this.alienPopulation = alienPopulation;
        this.setMeasureChange();
    }

    public void setMeasureChange() {
        if (this.alienPopulation > nativePopulation){
            this.setChanged();
            this.notifyObservers();
        }
    }
}
