package com.qf.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo2
 * @created : 2020/8/14
 * @description :
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
    /*    MySingleton mySingleton = MySingleton.getMySingleton();
        mySingleton.name="zhangsan";
        System.out.println(mySingleton.name);
        MySingleton mySingleton1 = MySingleton.getMySingleton();
        mySingleton1.name="zhangsan";
        System.out.println(mySingleton1.name);*/
        Class c=Class.forName("com.qf.demo2.MySingleton1");

       /* MySingleton1 mySingleton = MySingleton1.getMysigleton1();
        mySingleton.name="lisi";
        System.out.println(mySingleton.name);
        MySingleton mySingleton1 = MySingleton.getMySingleton();
        mySingleton1.name="lisi";
        System.out.println(mySingleton1.name);*/
        MySingleton2 mySingleton2 = MySingleton2.getMySingleton2();
        mySingleton2.name="lisi";
        System.out.println(mySingleton2.name);
        mySingleton2.name="lisi";
        System.out.println(mySingleton2.name);



    }
}
