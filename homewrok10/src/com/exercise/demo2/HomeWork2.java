package com.exercise.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.exercise.demo2
 * @created : 2020/8/2
 * @description :2、定义人类，人类有吃饭的方法，中国人、美国人、印度人继承人类，
 * 重写吃饭的方法，分别输出中国人用筷子吃饭，
 * 美国人用刀叉吃饭，印度人用手吃饭，编程实现上面的案例。
 */
public class HomeWork2 {
    public static void main(String[] args) {
        ChinesePeople chinesePeople=new ChinesePeople("中国人");
        AmericaPeople americaPeople=new AmericaPeople("美国人",20);
        IndiaPeople indiaPeople=new IndiaPeople("印度人");
        chinesePeople.eat();
        americaPeople.eat();
        indiaPeople.eat();
    }
}
