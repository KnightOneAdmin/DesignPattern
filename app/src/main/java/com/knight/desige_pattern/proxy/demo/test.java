package com.knight.desige_pattern.proxy.demo;

import java.lang.reflect.Proxy;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class test {
    public static void main(String[] args) {
        //1.创建自己
        ILawsuit knight = new KnightSubject();
        //2.创建我的代理人
//        Mylawyer mylawyer = new Mylawyer(knight);
//        mylawyer.submit();
//        mylawyer.burden();
//        mylawyer.defent();
//        mylawyer.finish();
        DynamicProxy proxy = new DynamicProxy(knight);
        ClassLoader classLoader = knight.getClass().getClassLoader();
        Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, proxy);
    }
}
