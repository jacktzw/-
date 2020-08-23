package com.qf.day15.com.qf.day15.obj;

import java.util.Objects;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15
 * @created : 2020/8/7
 * @description : 任何类都是object类的子对象，Animal类继承了Object类
*/
public class TestObject {
    public static void main(String[] args) {
        Animal obj1=new Animal();
        System.out.println(obj1);
        Animal obj2=new Animal();
        System.out.println(obj2);
        Object object3=obj2;
        System.out.println(object3);
        System.out.println(obj2==object3);
      /*  Animal obj3=new Animal();  //16*7=112
        System.out.println(obj3);
        //obj1.setId("343");
        //obj2.setId("343");
        Object o1=obj1;
        Object o2=obj2;    //   16+15
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(obj1.equals(obj2));
        String a=null;
       // a.hashCode();
        System.out.println(o1.getClass());
        System.out.println(o1.getClass().getName());
        System.out.println(obj1);*/
    }
}
