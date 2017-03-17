package com.knight.desige_pattern.template;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.print("只有程序员才可以登录此台计算机。。。。");
    }
}
