package com.knight.desige_pattern.proxy.demo;

/**
 * Created by knightoneadmin on 2017/3/8.
 *
 *    我的代理人
 */

public class Mylawyer implements ILawsuit {
   private KnightSubject knight;

    public Mylawyer(KnightSubject knight) {
        this.knight = knight;
    }

    @Override
    public void submit() {
        knight.submit();
    }

    @Override
    public void burden() {
        knight.burden();
    }

    @Override
    public void defent() {
        knight.defent();
    }

    @Override
    public void finish() {
        knight.finish();
    }
}
