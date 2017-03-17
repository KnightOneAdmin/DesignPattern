package com.knight.desige_pattern.singleton;

/**
 * Created by knightoneadmin on 2017/3/17.
 */

public class Singleton {
    private static Singleton singleton;
    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }
}
