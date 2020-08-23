package com.qf.day16;

import java.util.Arrays;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class Demo8 {
    public static void main(String[] args) {
        /*CharSequence str = "hello world";
        CharSequence sub = str.subSequence(6,11);
        System.out.println(sub);*/
        char[] value=new char[16]; //1540e19d
        System.out.println(value.length);
        System.out.println(value.hashCode());
        value=Arrays.copyOf(value,32);
        System.out.println(value.length);
        System.out.println(value.hashCode());

        //value = Arrays.copyOf(value,
              //  newCapacity(minimumCapacity));
    }
}
