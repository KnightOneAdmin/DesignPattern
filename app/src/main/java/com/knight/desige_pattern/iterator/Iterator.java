package com.knight.desige_pattern.iterator;

/**
 * Created by knightoneadmin on 2017/3/8.
 *  迭代器接口
 */

public interface Iterator<T> {
    /**
     * 是否有下一个元素
     *
     * @return true 表示有， false 表示没有
     */
    boolean hasNext();

    T next();
}
