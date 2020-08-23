package com.qf.day15.com.qf.day15.demo4;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo4
 * @created : 2020/8/15
 * @description :
 */
public class GenericClass {
    public static void main(String[] args) {
        Generic<String> generic=new Generic();
        generic.setName("tt");
        System.out.println(generic.getName());
        System.out.println("------");
        Generic<Integer>generic1=new Generic<>();
        generic1.setName(43);
        Integer ss = generic1.getName();

        System.out.println(generic1.getName());
        Generic generic2=new Generic();
        generic2.setName("35");
        Object name = generic2.getName();
        System.out.println(generic2.getName());
    }
}
