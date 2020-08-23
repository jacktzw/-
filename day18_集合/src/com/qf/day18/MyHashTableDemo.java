package com.qf.day18;

import java.util.Hashtable;
import java.util.Set;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day18
 * @created : 2020/8/12
 * @description :
 */
public class MyHashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable=new Hashtable<String, String>();
        hashtable.put("a","张三");
        hashtable.put("aa","李四");
        hashtable.put("aaa","王五");
        hashtable.put("aaab","赵六");
        Set<String> set = hashtable.keySet();
        for (String s : set) {
            System.out.println(s+hashtable.get(s));
        }

    }
}
