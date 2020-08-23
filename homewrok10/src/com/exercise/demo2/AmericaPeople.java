package com.exercise.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo2
 * @created : 2020/8/2
 * @description :
 */
public class AmericaPeople extends People {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AmericaPeople(String name,int age){
        super(name);
        this.age=age;
    }
    @Override
    public void eat() {
        System.out.println("年龄为:"+this.getAge()+"的"+this.getName()+"用刀叉吃饭");
    }
}
