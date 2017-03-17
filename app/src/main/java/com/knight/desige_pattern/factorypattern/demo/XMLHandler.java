package com.knight.desige_pattern.factorypattern.demo;

/**
 * Created by knightoneadmin on 2017/3/7.
 */

public class XMLHandler extends IOHandler {
    @Override
    public void add(String id, String name) {
        //业务处理
    }

    @Override
    public void remove(String id) {
//业务处理
    }

    @Override
    public void updata(String id, String name) {
        //业务处理
    }

    @Override
    public String query(String id) {
        //业务处理
        return "XML";
    }
}
