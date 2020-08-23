package com.qf.day16;

import java.util.Arrays;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/10
 * @description :
 */
public class MyDemo3 {
    public static void main(String[] args) {
        String s1=" hello,world every one, ";
        char c = s1.charAt(1);
        System.out.println(c);

        boolean one = s1.contains("one");
        System.out.println(one);

        char[] ss = s1.toCharArray();
        System.out.println(Arrays.toString(ss));

        int world = s1.indexOf("world");
        System.out.println(world);

        int i = s1.indexOf(9);
        System.out.println(i);
        System.out.println(s1.length());

        String s2=s1.trim();
        System.out.println(s2.length());

        String s3 = s1.replace('h', 's');
        System.out.println(s3);

        boolean b = s1.startsWith("one");
        System.out.println(b);
        String[] s8 = s1.split("every");
        System.out.println(Arrays.toString(s8));
        String str="中国";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
