package com.knight.desige_pattern.factorypattern;

/**
 * Created by knightoneadmin on 2017/3/7.
 */

/**
 * 抽象工厂类
 */
public abstract class Factory {
    /**
     * 抽像产品
     *
     * @return
     */
//    public abstract Product  conCreateProduct();
    public abstract <T extends Product> T conCreateProduct(Class<T> clz);
}
