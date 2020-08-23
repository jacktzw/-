package com.exercise.demo3;
/**
 * debug调试程序
 * 使用方式:
 *  f8逐行执行程序
 *  f7进入方法中
 *  shift+f8跳出方法
 *  f9跳到下一个断点，如果没有下一个断点，终止程序
 *  ctrl+f2退出debug停止程序
 *  console 控制台
 */

import java.util.Arrays;
import java.util.Random;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo3
 * @created : 2020/8/2
 * @description :
 */
public class HomeWork3  {
    public static void main(String[] args) {
        TV tv=new TV(800,4000,"美的");
        tv.player();
        TV[] tvs=new TV[5];
        Random random=new Random();
        for (int i = 0; i <5 ; i++) {
            tvs[i]=new TV(1000,random.nextInt(1000)+1000,"中幸"+i);
            //tvs[i].player();
            System.out.println("马力为: "+tvs[i].getPower()+"价格为: "+tvs[i].getPrice()+"品牌为:"+tvs[i].getBrand());
        }
        //按照价格对家电数组进行排序
        for (int i = 0; i < tvs.length; i++) {
            for (int j = 0; j < tvs.length-1-i; j++) {
                if(tvs[j].getPrice()>tvs[j+1].getPrice()){
                   TV tv2=tvs[j];
                   tvs[j]=tvs[j+1];
                   tvs[j+1]=tv2;
                }
            }
        }
        for (int i = 0; i < tvs.length; i++) {
            tvs[i].init();
        }
    }
}
