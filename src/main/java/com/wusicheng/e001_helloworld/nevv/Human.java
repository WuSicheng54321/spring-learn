package com.wusicheng.e001_helloworld.nevv;

/**
 * @author wsc
 * @date 2018/7/25
 * @description
 */

public class Human {
    private Cup cup;

    public Human(Cup cup) {
        this.cup = cup;
    }

    public void drint() {
        cup.cover();
        System.out.println("喝水");
    }
}
