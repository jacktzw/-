package com.qf.day15.com.qf.day15.com.qf.day15.game;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.com.qf.day15.game
 * @created : 2020/8/8
 * @description :
 */
public class Test2 {
    public static void main(String[] args) {
        /*Integer i=new Integer(30);
        String a=String.valueOf(30);
        System.out.println(i);
        System.out.println(a);
        Integer.valueOf(11);
       // int as=Integer.parseInt("ss");
        String s = i.toString();
       // System.out.println(as);
        System.out.println(s);
        System.out.println(65536%100);*/
      /*  Integer i=Integer.valueOf(-5);
        String s=String.valueOf(3);
        System.out.println(s);*/

/*int sign=-2;
        System.out.println(sign);
         sign=-sign;
        System.out.println(sign);
        System.out.println(Integer.toString(-2147483648));*/
      /*  System.out.println((1020 * 52428) >>> (16+3));  // 理论上精确的除以10，在计算机计算过程中可能会产生向下取整导致结果不准确的问题
        System.out.println((1020 * 52429) >>> (16+3));  // 改进版
        System.out.println(  ((1<<31)-1)/52429 );  //40959 81918
        System.out.println(1<<15);
        System.out.println(1<<16);
        System.out.println(1<<17);
        System.out.println(40959*2);*/
        int n1=255;
        String s1=n1+"";
        String s2=Integer.toString(n1,16);
        String s3=Integer.toString(n1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Double b=99.0;
        System.out.println(b);

    }
}
