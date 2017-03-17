package com.knight.desige_pattern.factorypattern.demo;

/**
 * Created by knightoneadmin on 2017/3/7.
 */

public abstract class IOFactory {
    public abstract <T extends IOHandler> T conCreateFactory(Class<T> clz);
}
