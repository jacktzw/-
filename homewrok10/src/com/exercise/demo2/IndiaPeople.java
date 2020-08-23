package com.exercise.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo2
 * @created : 2020/8/2
 * @description :
 */
public class IndiaPeople extends People {
    public IndiaPeople(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"用手吃饭....");
    }
}
