package com.stars.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BeverageMakerHandler implements InvocationHandler {

    Object target;

    public BeverageMakerHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return method.invoke(target, objects);
    }
}
