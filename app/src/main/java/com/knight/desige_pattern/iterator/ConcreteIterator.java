package com.knight.desige_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by knightoneadmin on 2017/3/8.
 * 迭代器具体实现
 */

public class ConcreteIterator<T> implements Iterator {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
