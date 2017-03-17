package com.knight.desige_pattern.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object objProxy, Method method, Object[] objects) throws Throwable {
        Object invoke = method.invoke(obj, objects);
        return invoke;
    }
}
