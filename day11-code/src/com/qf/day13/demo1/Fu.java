package com.qf.day13.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day13.demo1
 * @created : 2020/8/5
 * @description :
 */
public abstract class Fu {
    String name;

    public Fu() {
    }


    public Fu(String name) {
        this.name = name;
    }

    public   abstract void method();
}
