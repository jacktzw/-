package com.qf.day16;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class MyDemo2 {
    public static void main(String[] args) {
        String a="abc";
        a="sdfdsfd";
        System.out.println(a);
        //String对象创建不可变，是指String的内部使用一个final char[]数组来存储数据， 所以值不能改变
        //String每次重新赋值相当于重新地创建了字符串
        String s13=new String("343");
        //System.out.println(s1);

        //
        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);
          s1.length();
          s2.trim();
        String s5="ab";
        String s6="a"+"b";
        System.out.println(s5==s6);



    }
}
