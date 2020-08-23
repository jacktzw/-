package com.qf.day15.com.qf.day15.com.qf.day15.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.demo2
 * @created : 2020/8/8
 * @description :
 */
public class TestStatic {
    public static void main(String[] args) {
        StaticA.StaticB b=new StaticA.StaticB();
        b.m();
        b.m1();
        System.out.println(StaticA.StaticB.name) ;
    }
}
