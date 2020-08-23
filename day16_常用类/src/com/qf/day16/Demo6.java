package com.qf.day16;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class Demo6 {
    public static void main(String[] args) {
        GregorianCalendar calendar=new GregorianCalendar();
        System.out.println(calendar);
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
        int date = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 星期几
        //System.out.println(day1+"----"+day2+"----"+day3);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒"+week+"周");
        System.out.println(date);
        System.out.printf("%d年",year);
    }
}
