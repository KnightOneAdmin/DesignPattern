package com.knight.desige_pattern.iterator;

/**
 * Created by knightoneadmin on 2017/3/8.
 */

public class test {
    public static void main(String[] args) {
        Aggregate<String> a = new ConreteAggregate<>();
        a.add("aige");
        a.add("Stutio\n");
        a.add("SM");
        a.add("Brother");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
