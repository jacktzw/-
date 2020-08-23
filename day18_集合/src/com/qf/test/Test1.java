package com.qf.test;

import java.util.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.test
 * @created : 2020/8/13
 * @description :
 */
public class Test1 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("苹果");
        collection.add("⻄⽠");
        collection.add("榴莲");
        System.out.println("元素个数:"+collection.size());
        String s1 = ((ArrayList<String>) collection).get(1);
        System.out.println(s1);
        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            System.out.println(s);
            if(s1.equals("西瓜")){
                iterator.remove();
            }

        }
        System.out.println(collection);
        System.out.println(collection.size());


        Map<String, String> map = new TreeMap<>();
        map.put("name", "user");
        map.put("password", "12345");
        //System.out.println(map);

        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            if (entry.getKey().equals("name")) {
                iterator.remove();
            }
        }
        System.out.println(map);

    }
}
