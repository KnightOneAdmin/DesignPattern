package com.knight.desige_pattern.proxy;

/**
 * Created by knightoneadmin on 2017/3/8.
 *
 * 具体要做的事
 */

public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("visit....需要做的事情。。。。");
    }
}
