package com.qf.day13.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day13.demo1
 * @created : 2020/8/5
 * @description :abstract和final不能同时使用
 */
public class Zi extends Fu {
    int age;

    public Zi(int age,String name) {
        this.age = age;
    }

    public Zi(String name, int age) {
        this.age = age;
    }



    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);
        num1=20;
        System.out.println(num1);
        final int num2=200;
        System.out.println(num2);
        //num2=400;
        final int num3;
        num3=90;
        System.out.println(num3);
    }
    @Override
    public void method() {

    }
//    @Override
//    public void method() {
//        super.method();
//    }
}
