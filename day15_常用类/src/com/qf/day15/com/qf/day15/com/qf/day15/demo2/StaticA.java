package com.qf.day15.com.qf.day15.com.qf.day15.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.demo2
 * @created : 2020/8/8
 * @description :
 */
public class StaticA {
    public String n="sss";
    public static  String count;
    public static class StaticB{
        public static String name="李四";
        public static String s="aaa";
        StaticA a=new StaticA();
        public void m(){
            //System.out.println(n);
            System.out.println(a.n);
            System.out.println(name);
            System.out.println(s);
        }
        public void m1(){
            System.out.println(StaticA.count);
        }
    }

}
