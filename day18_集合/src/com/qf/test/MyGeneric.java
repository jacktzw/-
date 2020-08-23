package com.qf.test;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.test
 * @created : 2020/8/13
 * @description :
 */
public class MyGeneric<T> {
    T t;
    public void show(T t){
        System.out.println(t);
    }
    public T getT(){
        return t;
    }
}
