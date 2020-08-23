package com.exercise.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo1
 * @created : 2020/8/2
 * @description :
 */
public class Car extends Vehice {
    private String brand; //品牌

    public Car(String brand,String color,int speed,int hyl) {
        this.setColor(color);
        this.setSpeed(speed);
        this.setHyl(hyl);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void brake(){
        System.out.println("品牌为:"+this.brand+",颜色为: "+this.getColor()+",速度为: "+this.getSpeed()+",耗油量为:"+this.getHyl()+"的汽车刹车.......");
    }
}
