package com.qf.exercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.exercise
 * @created : 2020/8/10
 * @description :
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
        DateFormat sdf1=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String s = sdf.format(date);
        System.out.println(s);
        System.out.println("请输入一个时间");
        String s1=HomeWork1.sc.nextLine();

        Date date2 = null;
        try {
            date2 = sdf1.parse(s1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar=Calendar.getInstance();
            calendar.setTime(date2);
            calendar.add(Calendar.DAY_OF_MONTH,10);
            //Date date3 = calendar.getTime();//日历对象转化位日期对象
            //String news = sdf1.format(date3);
            System.out.println(sdf1.format(calendar.getTime()));

        HomeWork1.sc.close();


    }
}
