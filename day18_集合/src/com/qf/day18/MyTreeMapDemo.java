package com.qf.day18;

import java.util.Set;
import java.util.TreeMap;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day18
 * @created : 2020/8/12
 * @description :
 */
public class MyTreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Song,String> treeMap=new TreeMap<>();
        treeMap.put(new Song("","",343),"zhangsan");
        treeMap.put(new Song("","",122),"lisi");
        treeMap.put(new Song("","",567),"wangwu");
        treeMap.put(new Song("","",99),"zhaosi");
        Set<Song> songs =treeMap.keySet();
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
