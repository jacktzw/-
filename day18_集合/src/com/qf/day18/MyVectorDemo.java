package com.qf.day18;

import java.util.Vector;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day18
 * @created : 2020/8/12
 * @description :
 */
public class MyVectorDemo {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("one");
        vector.add("two");
        vector.add("three");
        vector.remove(1);
        for (String s : vector) {
            System.out.println(s);
        }
    }
}
