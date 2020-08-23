package com.qf.day15.test;

import com.qf.day15.test.MyInterface;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15
 * @created : 2020/8/7
 * @description :匿名内部类是将接口使用new关键字创建对象进行一个匿名实现...
 */
public class Test {
    public static void main(String[] args) {
        MyInterface myInterface=new MyInterface() {
            @Override
            public void m1() {
                System.out.println("m1....");
            }
        };
        myInterface.m1();
        MyInterface m2=new MyInterface() {
            @Override
            public void m1() {
                System.out.println("m2.........");
            }
        };
        m2.m1();
        Object o;
    }
}
