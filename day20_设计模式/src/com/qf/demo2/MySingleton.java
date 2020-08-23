package com.qf.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo2
 * @created : 2020/8/14
 * @description :
 */
public class MySingleton {
    String name;
    //饿汉模式
    private static MySingleton mySingleton;
    static {
        mySingleton=new MySingleton();
        System.out.println("3434");
    }
    private MySingleton(){

    }
    public static MySingleton getMySingleton(){
        return  mySingleton;
    }
}
