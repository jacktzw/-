package com.exercise.demo3;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo3
 * @created : 2020/8/2
 * @description :
 */
public class TV extends HomeAppliances {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TV(int power, double price, String brand) {
        super(power, price, brand);
    }
    //播放方法
    public void player(){
        super.init();
        System.out.println("功率为:"+super.getPower()+"价格为:"+super.getPrice()+"品牌为:"+super.getBrand()+"在播放.........");
    }

}
