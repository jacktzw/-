package com.qf.day15.com.qf.day15.demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo4
 * @created : 2020/8/15
 * @description :<? extends Number > <></></>子类以及本身 父类以及本身。。。
 */
public class GenericDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.add("aa");
        list.add("bb");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        showArray(list1);
        showArray(list);
        System.out.println(list1);

    }
    public static void showArray(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();

        while(iterator.hasNext()){

            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
