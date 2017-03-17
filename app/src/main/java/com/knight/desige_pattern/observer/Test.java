package com.knight.desige_pattern.observer;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class Test {
    public static void main(String[] args) {
        //先创建被观察者角色，
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        //观察者
        Coder mrsimple = new Coder("mr.knight");
        Coder coder_1 = new Coder("coder-1");
        Coder coder_2 = new Coder("coder-2");
        Coder coder_3 = new Coder("coder-3");
        Coder coder_4 = new Coder("coder-4");
        //将观察者注册到可观察对象的观察列表中
        devTechFrontier.addObserver(mrsimple);
        devTechFrontier.addObserver(coder_1);
        devTechFrontier.addObserver(coder_2);
        devTechFrontier.addObserver(coder_3);
        devTechFrontier.addObserver(coder_4);
        devTechFrontier.postNewPublication("新的一期开发技术周报发布了。。。");
    }
}
