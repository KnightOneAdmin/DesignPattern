package com.knight.desige_pattern.template;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class TeacherComputer extends AbstractComputer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("老师在检查防火墙。。。。");
    }

    @Override
    protected void login() {
        System.out.println("只有老师才能登录。。。。");
    }
}
