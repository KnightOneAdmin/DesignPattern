package com.knight.desige_pattern.factorypattern.demo;

/**
 * Created by knightoneadmin on 2017/3/7.
 */

public abstract class IOHandler {
    /**
     * 增
     *
     * @param id
     * @param name
     */
    public abstract void add(String id, String name);

    /**
     * 删
     *
     * @param id
     */
    public abstract void remove(String id);

    /**
     * 改
     *
     * @param id
     * @param name
     */
    public abstract void updata(String id, String name);

    /**
     * 查
     *
     * @param id
     * @return
     */
    public abstract String query(String id);
}
