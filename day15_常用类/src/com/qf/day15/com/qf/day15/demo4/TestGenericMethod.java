package com.qf.day15.com.qf.day15.demo4;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo4
 * @created : 2020/8/15
 * @description :
 */
public class TestGenericMethod {
    public static void main(String[] args) {
        GenericMethod genericMethod=new GenericMethod();
        genericMethod.method01("ss");
        genericMethod.method02(3434);
        GenericMethod.method02("FFFF");
        GenericMethod.method02(999999);

    }
}
