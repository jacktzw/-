package com.qf.day15.com.qf.day15.com.qf.day15.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.demo2
 * @created : 2020/8/8
 * @description :
 */
public class Test {
    int bs=888;
    public static void main(String[] args) {
        int as=999888;
        System.out.println(A.B.aa);
        System.out.println(A.bb);
        System.out.println(A.ss);
        A a=new A();
        a.m();
        A.B b=a.new B();
        b.n="666";
        System.out.println(b.aa);
        System.out.println(b.n);
        b.method();
        a.m();
        System.out.println(as);


    }
}
