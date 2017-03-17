package com.knight.desige_pattern.proxy;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class test {
    public static void main(String[] args) {
        //创建一个真实主题
        RealSubject real = new RealSubject();
        ProxySubject proxy = new ProxySubject(real);
        proxy.visit();
    }
}
