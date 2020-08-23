package com.exercise.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo2
 * @created : 2020/8/2
 * @description :
 */
public class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void eat(){
        System.out.println(this.name+"吃饭.......");
    }
}
