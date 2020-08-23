package com.exercise.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo1
 * @created : 2020/8/2
 * @description :1、定义交通工具类，属性：颜色、速度、耗油量；方法：移动、停止。
 * 定义汽车类和轮船类继承交通工具，汽车类有品牌属性，有刹车方法
 * 轮船有排水量属性，有抛锚方法。
 */
public class Homework1 {
    public static void main(String[] args) {
        Car car = new Car("SUV", "白色", 110, 130); //创建汽车对象
        car.setSpeed(200);
        //car.setBrand(SUV"");
//        car.setColor("白色");
//        car.setHyl(100);
//        car.setSpeed(120);
        car.move();  //调用父类交通工具类的移动方法
        car.brake();//调用子类汽车类的刹车方法
        car.stop();//调用父类交通工具的停止方法
        Steamer steamer = new Steamer(200);//创建轮船对象
        steamer.setColor("黑色");
        steamer.setHyl(500);
        steamer.setSpeed(800);
        steamer.move();
        steamer.paomao(); //调用子类轮船类的抛锚的方法
        steamer.stop();


    }
}
