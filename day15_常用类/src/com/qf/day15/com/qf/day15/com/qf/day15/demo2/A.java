package com.qf.day15.com.qf.day15.com.qf.day15.demo2;

import java.util.Random;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.demo2
 * @created : 2020/8/8
 * @description :
 */
public class A {
    int i=3;
    int s=99;
   static Random random=new Random();
    final static int bb=999;
    static  int ss;
    public class B{
        String n="李白";
        int i=9;
        public void method(){
            s=888;
            System.out.println(i); //java内存池
            System.out.println(A.this.i);
            System.out.println(s);
        }
       final static int aa=555;

    }
    public void m(){
        B b=new B();
        System.out.println(b.n);
    }

}
