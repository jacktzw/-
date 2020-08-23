package com.exercise.demo3;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo3
 * @created : 2020/8/2
 * @description :
 */
public class HomeAppliances {
    private int power;//功率
    private double price;//价格
    private String brand;//品牌

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public HomeAppliances(int power, double price, String brand) {
        this.power = power;
        this.price = price;
        this.brand = brand;
    }

    public  void init(){
        System.out.println("品牌为:"+brand+",功率为:"+power+",价格为:"+price+"元");
    }


}
