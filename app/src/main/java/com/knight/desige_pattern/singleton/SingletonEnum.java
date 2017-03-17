package com.knight.desige_pattern.singleton;

/**
 * Created by knightoneadmin on 2017/3/17.
 */
public enum SingletonEnum {
    INSTANCE;
    private Singleton instance;

     SingletonEnum() {
        instance = new Singleton();
    }

    public Singleton getInstance() {
        return instance;
    }
}
