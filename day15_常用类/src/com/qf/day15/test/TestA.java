package com.qf.day15.test;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.test
 * @created : 2020/8/8
 * @description :
 */
public class TestA {
    public static void main(String[] args)  {
        //A a;
        Class<?> ss = null;
        try {
            ss = Class.forName("com.qf.day15.test.A");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Object o = ss.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
