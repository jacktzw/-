package com.qf.day15.com.qf.day15.com.qf.day15.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.demo2
 * @created : 2020/8/8
 * @description :
 */
public class TestMyInterface {
    public static void main(String[] args) {
        new MyInterface() {
            @Override
            public void run() {
                System.out.println("34343");
            }
        }.run();

    }
}
