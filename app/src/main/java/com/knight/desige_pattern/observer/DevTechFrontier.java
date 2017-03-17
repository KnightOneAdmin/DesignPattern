package com.knight.desige_pattern.observer;

import java.util.Observable;

/**
 * Created by knightoneadmin on 2017/3/8.
 *  DevTechFrontier 即开发技术前沿，这个网站是被观察者角色，当它有更新时所有的观察者（这里是程序员）会接到相应的通知
 */

public class DevTechFrontier extends Observable {
    public void postNewPublication(String content) {
        setChanged();
        notifyObservers(content);
    }
}
