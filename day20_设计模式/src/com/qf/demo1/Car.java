package com.qf.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo1
 * @created : 2020/8/14
 * @description :
 */
public class Car {
    private String id;
    private String brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
