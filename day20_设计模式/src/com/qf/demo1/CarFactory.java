package com.qf.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo1
 * @created : 2020/8/14
 * @description :
 */
public class CarFactory {
    public static int id=0;
    public static Car BuildCar(){
        id++;
        Car car=new Car();
        car.setId("BCNZ00"+id);
        car.setBrand("奔驰");
        return car;
    }
}
