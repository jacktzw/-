package com.qf.day16;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class MyDemo4 {
    public static void main(String[] args) {
        //创建StringBuffer StringBuilder
        StringBuffer sb=new StringBuffer("hello");
        StringBuilder s=new StringBuilder("343");
        sb.append("world....");
        System.out.println(sb);
        System.out.println(1.0-0.9);

        BigDecimal b1=new BigDecimal("1.0");
        BigDecimal b2=new BigDecimal(0.9);

       // System.out.println(b1.divide(b2,2000000,BigDecimal.ROUND_HALF_UP));


        BigDecimal b3=new BigDecimal("343434343434");
        BigDecimal b4=new BigDecimal("234243542038439584895485489545");
        System.out.println(b3.multiply(b4));

        BigDecimal b5=new BigDecimal("1.0343434");
        BigDecimal b6=new BigDecimal("1.983434");
        System.out.println(b5.multiply(b6));

        Date date=new Date();
        date.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(1597046626238l);
        System.out.println(date);
        Date d1=new Date();
        System.out.println(date.before(d1));
        date.compareTo(d1);


    }
}
