package com.qf.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {

        String s="2020/8/10 16:20:30.189";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        SimpleDateFormat sdf2=new SimpleDateFormat();
        try {
            Date date = sdf.parse(s);
            Date date1=sdf.parse(s);
            System.out.println(date);
            //sSystem.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date d1=new Date();
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String s1 = sdf1.format(d1);
        s1.isEmpty();
        System.out.println(s1);
        String test="1411840699@qq.com";
        System.out.println(test.indexOf("@"));
        System.out.println(test.indexOf("."));
    }
}
