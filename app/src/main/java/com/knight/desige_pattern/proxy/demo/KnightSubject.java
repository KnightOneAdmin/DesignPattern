package com.knight.desige_pattern.proxy.demo;

/**
 * Created by knightoneadmin on 2017/3/8.
 * 具体诉讼人
 */

public class KnightSubject implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("开始提交资料。。。。");
    }

    @Override
    public void burden() {
        System.out.println("开始举证。。。。");
    }

    @Override
    public void defent() {
        System.out.println("开始辩护。。。。");
    }

    @Override
    public void finish() {
        System.out.println("完成诉讼。。。");
    }
}
