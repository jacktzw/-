package com.qf.day16;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class MyDemo {
    public static void main(String[] args) {

        //Integer常量池(缓冲区)
        //在Integer中会设置-128-127，一共256个常量
        //在使用valueof或者直接使用数字赋值时，如果找到直接返回该常量
        Integer in2=100;
        Integer in3=100;
        System.out.println(in2==in3);

        Integer in4=200;
        Integer in5=200;
        System.out.println(in4==in5);

        Integer in6=new Integer(100);//堆中的引用
        Integer in7=new Integer(100);
        System.out.println(in6==in7);

        Integer in8=Integer.valueOf(100);
        Integer in9=Integer.valueOf(100); //常量池中
        System.out.println(in8==in9);

        String a="123";
        int i = Integer.parseInt(a);
        System.out.println(i);


    }
}
