package com.qf.day15.com.qf.day15.demo4;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo4
 * @created : 2020/8/15
 * @description :
 */
public class TestGenericImpl1 {
    public static void main(String[] args) {
        GenericInterface<Integer> genericInterface=new GenericImpl1();
        //genericInterface.method("fdd");
        genericInterface.method(43);
    }
}
