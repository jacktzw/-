package com.exercise.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo1
 * @created : 2020/8/2
 * @description :
 */
public class Steamer extends Vehice{
    private int displacement; //排水量

    public Steamer(int displacement) {
        this.displacement = displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void paomao(){
        System.out.println("排水量为:"+this.getDisplacement()+",颜色为: "+this.getColor()+",速度为: "+this.getSpeed()+",耗油量为:"+this.getHyl()+"的汽车刹车.......");
    }
}
