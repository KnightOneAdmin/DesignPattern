package com.knight.desige_pattern.proxy.demo;

/**
 * Created by knightoneadmin on 2017/3/8.
 *  诉讼接口 （要做的事）
 */

public interface ILawsuit {
    /**
     * 接交升请
     */
    void submit();

    /**
     * 进行举证
     */
    void burden();

    /**
     * 进行辩护
     */
    void  defent();

    /**
     * 完成
     */
    void finish();
}
