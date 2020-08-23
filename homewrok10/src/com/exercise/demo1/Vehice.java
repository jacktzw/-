package com.exercise.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo1
 * @created : 2020/8/2
 * @description :
 */
public class Vehice {
    private String color; //颜色
    private int speed;//速度
    private int hyl;//耗油量

    public void setColor(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHyl(int hyl) {
        this.hyl = hyl;
    }

    public int getHyl() {
        return hyl;
    }

    protected void move(){
        System.out.println("颜色为: "+this.color+",速度为: "+this.speed+",耗油量为:"+this.hyl+"在移动.......");

    }
    public void stop(){
        System.out.println("颜色为: "+this.color+",速度为: "+this.speed+",耗油量为:"+this.hyl+"停止.......");
    }
}
