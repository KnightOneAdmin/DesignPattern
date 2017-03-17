package com.knight.desige_pattern.factorypattern;


/**
 * Created by knightoneadmin on 2017/3/7.
 */

public class ConcreateFactory extends Factory {

    //    @Override
//    public Product conCreateProduct() {
//        return new ConCreateProductA();
//    }
    @Override
    public <T extends Product> T conCreateProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }

}
