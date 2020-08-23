package com.qf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf
 * @created : 2020/8/11
 * @description :
 */
public class MyDemo1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        String a="434";
        list.remove(2);
        list.add("aaa");
        List list1 = list.subList(0, 2);
        list1.remove(0);
        System.out.println(list1.size());
        System.out.println(list1);





    }
}
