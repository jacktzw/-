package com.qf.day18;

import java.util.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day18
 * @created : 2020/8/12
 * @description :
 */
public class MyHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("ff");
        set.add("adf");
        set.add("gfd");
        set.add("h");
        set.add("c");
        set.add("c");
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*System.out.println("================");
        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("ff");
        set1.add("adf");
        set1.add("gfd");
        set1.add("h");
        set1.add("c");
        set1.add("c");
        for (String s : set1) {
            System.out.println(s);
        }
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"zhangsan"));
        list.add(new Student(11,"zhangsan"));
        list.add(new Student(11,"zhangsan"));
        list.add(new Student(22,"zhangsan"));
        list.add(new Student(22,"zhangsan"));
        list.add(new Student(33,"zhangsan"));
        for (Student student : list) {
            System.out.println(student);
        }
        //HashSet无序
        System.out.println("--------------------");
        LinkedHashSet<Student> hashSet=new LinkedHashSet();
        hashSet.addAll(list);
        for (Student s : hashSet) {
            System.out.println(s);
        }*/
    }
}
