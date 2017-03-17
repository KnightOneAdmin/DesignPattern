package com.knight.desige_pattern.iterator;

/**
 * Created by knightoneadmin on 2017/3/8.
 * <p>
 * 容器接口
 */

public interface Aggregate<T> {
    /**
     * 添加一个元素
     *
     * @param obje
     */
    void add(T obje);

    /**
     * 移除一个元素
     *
     * @param obje
     */
    void remove(T obje);

    /**
     * 获取一个迭代器
     *
     * @return
     */
    Iterator<T> iterator();
}
