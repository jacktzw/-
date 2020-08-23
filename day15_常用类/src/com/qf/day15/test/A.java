package com.qf.day15.test;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.test
 * @created : 2020/8/8
 * @description :
 */
public class A {
    static  int n=5;
    int m=9;
    static {
        System.out.println("我是静态代码块");
        System.out.println(n);
    }
    {
        System.out.println("我是代码块");
        System.out.println(m);
    }
    A(){
        System.out.println("我是构造方法");
    }
}
