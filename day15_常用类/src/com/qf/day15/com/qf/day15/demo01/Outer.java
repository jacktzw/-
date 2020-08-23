package com.qf.day15.com.qf.day15.demo01;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo01
 * @created : 2020/8/8
 * @description :
 */
public class Outer {
    int num=10;
    public class inner{
        int num=20;
        public void method(){
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
