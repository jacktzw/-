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
public class MyCollectionsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "test", "aaa");
//        ArrayList<String> list= (ArrayList<String>) list1;
        list.toArray();
        System.out.println(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
