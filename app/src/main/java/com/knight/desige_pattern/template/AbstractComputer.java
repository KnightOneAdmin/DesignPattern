package com.knight.desige_pattern.template;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public abstract class AbstractComputer {
    /**
     * 开启电源
     */
    protected void powerOn() {
        System.out.println("开启电源....");
    }

    /**
     * 检查硬件
     */
    protected void checkHardware() {
        System.out.println("检查硬件....");
    }

    /**
     * 加载系统
     */
    protected void loadOs() {
        System.out.println("加载系统....");
    }

    /**
     * 登录
     */
    protected void login() {
        System.out.println("小白登录了....");
    }

    public final void startUp() {
        System.out.println("========= 关机 START ======");
        powerOn();
        checkHardware();
        loadOs();
        login();
        System.out.println("========= 关机 END ======");
    }
}

