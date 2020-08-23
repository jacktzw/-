package com.qf.day15.com.qf.day15.com.qf.day15.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.demo2
 * @created : 2020/8/8
 * @description :
 */
public class C {
    String n;
    public void m(){
        class B{
            int i=5;
            public void m1(){
                System.out.println(n);
                System.out.println(i);
                n="777";
            }
        }
                B b=new B();
        b.i=99;
        b.m1();
        System.out.println(b.i);
    }
    public void m2(){

    }
}
