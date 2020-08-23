package com.qf.day15.com.qf.day15.com.qf.day15.demo2;

import java.util.Arrays;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.demo2
 * @created : 2020/8/8
 * @description :
 */
public class TestC {
    public static void main(String[] args) {
       /* String s1 = new String("abcdef");
        String s2 = s1.substring(2, 4);
        // 打印：ab199863
        System.out.println(s1);
        System.out.println(Integer.toHexString(s1.hashCode()));
        // 打印：c61, 显然s1和s2不是同一个对象
        System.out.println(Integer.toHexString(s2.hashCode()));
        System.out.println(s2);
        System.out.println(s1.toUpperCase());
        boolean b=s1.startsWith("a",0);
        System.out.println(b);*/
        String say="abc,de,f,g,";
        String[] arr="abc,de,f,g,".split(",");
        String[] arr1="abc,de,f,g".split(",");
        String[] arr2=",abc,de,f,g,".split(",");

        System.out.println(arr.length);
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        String a="\\";
        System.out.println(a);
        for (String s : arr) {
            System.out.println(s);
        }
        int ch=(','-'0');  //56319  56064
        System.out.println(ch);
        int aa='\uDB00';
        char b=56064;
        System.out.println(b);
        int s1=(','-'0');
        int s2='9'-',';
        System.out.println(s1);
        System.out.println(s2);
        System.out.println('c');
        System.out.println(s1|s2);
        String str = "aaa|bbb|ccc";
    String[] array2 = str.split("|");
    System.out.println(Arrays.toString(array2));
       int ch2;
       ch=',';
       boolean b1= ((ch2 = ch-'0')|('9'-ch)) < 0;
        System.out.println(b1);
        System.out.println(Integer.toBinaryString(-6));
         //正数和负数与运算永远是负数
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(-6));
        System.out.println(-9|3);
        int m = 12;
        int n = m << 1 + 2;
        int nn= m << (1 + 2); //这样更直观
        System.out.println(nn);
        System.out.println(n);
        String k="k";
        System.out.println("-----------");
        System.out.println(k.substring(0,0));

         String sss="aaa".substring(0,1);
        System.out.println(sss);
        System.out.println("".length());




    }
}
