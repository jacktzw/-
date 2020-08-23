package com.qf.day15.com.qf.day15.demo4;

import sun.security.x509.GeneralNameInterface;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo4
 * @created : 2020/8/15
 * @description :
 *
 */
public class GenericImpl1 implements GenericInterface<Integer>{
    @Override
    public void method(Integer s) {
        System.out.println(s);
    }
}
