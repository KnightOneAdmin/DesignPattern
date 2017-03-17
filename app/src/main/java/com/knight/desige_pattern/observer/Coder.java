package com.knight.desige_pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by knightoneadmin on 2017/3/8.
 * 程序员是观察者
 */

public class Coder implements Observer {
    private String name;

    @Override
    public void update(Observable observable, Object o) {
        System.out.print("Hi," + name + ",DevTechFrontier 更新了，内容：" + o);
    }

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
