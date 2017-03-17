package com.knight.desige_pattern.proxy;

/**
 * Created by knightoneadmin on 2017/3/8.
 *  代理类
 */

public class ProxySubject extends Subject {
    public RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        realSubject.visit();
    }
}
