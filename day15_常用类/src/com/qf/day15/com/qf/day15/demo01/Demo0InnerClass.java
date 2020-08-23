package com.qf.day15.com.qf.day15.demo01;


import java.util.Date;

import static java.lang.Math.*;
/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo01
 * @created : 2020/8/7
 * @description :
 */
public class Demo0InnerClass {
    public static void main(String[] args) {
        Body b=new Body();
        Body.heart S=b.new heart();
        S.beat();
        Outer.inner i=new Outer().new inner();
        i.method();
        //b.methodBody();
        System.out.println(PI);
       // A a=new A();
        System.out.println();
        Date date;
    }
}
