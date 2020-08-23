package com.qf.day15.com.qf.day15.demo4;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo4
 * @created : 2020/8/15
 * @description :
 *
 */
public class GenericImpl2 implements GenericInterface<String>{


    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
