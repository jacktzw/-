package com.exercise.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo2
 * @created : 2020/8/2
 * @description :
 */
public class ChinesePeople extends People {
    public ChinesePeople(String name) {
       super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.getName()+"用筷子吃饭");
    }
}
