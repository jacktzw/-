package com.qf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf
 * @created : 2020/8/11
 * @description :
 */
public class day17 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1); //10 15 22 33 49 73  109
        list.add("abc");
        Student stu=new Student("zhangsan",18);
        list.add(stu);
        list.remove(0);
        /*System.out.println(list.size());
        System.out.println(list.isEmpty());*/
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
      /*  for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------");
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.set(0,"hello");
        System.out.println("************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Student stu1=new Student("zhangsan",19);
        System.out.println(list.contains(stu1));
        List list1 = list.subList(0, 1);
        System.out.println("************");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }*/

    }
}
