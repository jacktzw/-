package com.qf.demo4;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo4
 * @created : 2020/8/14
 * @description :
 */
@MyAnotation(name="com.qf.demo4.Car",method = "say")
public class Car {
    @Id(name = "car_id")//配置了当前id实际上是car_id不是id
    int id;
    public void say(){
        System.out.println("say~~~say...........");
    }
}
