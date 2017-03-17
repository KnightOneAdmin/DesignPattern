package com.knight.desige_pattern.factorypattern.demo;

/**
 * Created by knightoneadmin on 2017/3/7.
 */

public class ConcrateFactory extends IOFactory {
    @Override
    public <T extends IOHandler> T conCreateFactory(Class<T> clz) {
        IOHandler handler = null;
        try {
            handler = (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) handler;
    }
}
