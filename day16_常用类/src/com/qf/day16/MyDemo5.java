package com.qf.day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class MyDemo5 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int day1=calendar.get(Calendar.DAY_OF_YEAR);
        int day2=calendar.get(Calendar.DAY_OF_WEEK);
        //int day3=calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);
        int week=calendar.get(Calendar.WEEK_OF_MONTH);
        int ss=calendar.get(Calendar.DATE);
        //System.out.println(day1+"----"+day2+"----"+day3);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒"+week+"周");
        System.out.println(ss);
        System.out.println("------------------");
        calendar.add(Calendar.SECOND,0);
         year=calendar.get(Calendar.YEAR);
         month=calendar.get(Calendar.MONTH)+1;
         day=calendar.get(Calendar.DAY_OF_MONTH);
         hour=calendar.get(Calendar.HOUR_OF_DAY);
         minute=calendar.get(Calendar.MINUTE);
         second=calendar.get(Calendar.SECOND);
         week=calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒"+week+"周");
        //System.out.println(calendar);
        Date date=calendar.getTime();
        System.out.println(date);
        //System.out.println(null.isEmpty());


    }
}
