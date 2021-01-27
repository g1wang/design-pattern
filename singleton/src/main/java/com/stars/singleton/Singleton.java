package com.stars.singleton;

public class Singleton {

    private Singleton() {
    }


    public static Singleton getSingleton() {

        return SingletonEnum.INSTANCE.getSingleton();

    }

    private enum SingletonEnum {
        INSTANCE;
        private Singleton singleton;

        SingletonEnum() {
            singleton = new Singleton();
        }

        private Singleton getSingleton() {
            return singleton;
        }
    }
}
