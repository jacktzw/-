package com.qf.day15.com.qf.day15.demo4;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo4
 * @created : 2020/8/15
 * @description :定义含有泛型的方法
 */
public class GenericMethod {
    public <S> void method01(S s){
        System.out.println(s);
    }
    public static <S> int method02(S s){
        System.out.println(s);
        return 1;
    }

}
