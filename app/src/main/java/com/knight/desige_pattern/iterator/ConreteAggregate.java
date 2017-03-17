package com.knight.desige_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class ConreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obje) {
        list.add(obje);
    }

    @Override
    public void remove(T obje) {
        list.remove(obje);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
