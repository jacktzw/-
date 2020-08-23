package com.qf.day16;

import java.util.Date;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class MyDate {
    public static void main(String[] args) {
        Date d=new Date();
        long time = d.getTime();
        System.out.println(time);
        d.setTime(1597053560546l);
        System.out.println(d);
        Date d1=new Date();
        System.out.println(d.before(d1));
        System.out.println(d.after(d1));
    }
}
