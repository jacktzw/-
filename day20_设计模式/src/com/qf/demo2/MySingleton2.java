package com.qf.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo2
 * @created : 2020/8/14
 * @description :
 */
public class MySingleton2 {
    String name;
    private static MySingleton2 mySingleton;
    private MySingleton2(){

    }
    //由于是私有类，外界无法访问，
    //里面的属性是static 只有加载类时候创建
    //由于该类是内部类，不会因为加载外部类而加载 线程安全 实现了懒汉模式，线程安全
    private static class inner{
        static MySingleton2 mySingleton=new MySingleton2();

    }
    public static MySingleton2 getMySingleton2(){
        return inner.mySingleton;
    }
}
