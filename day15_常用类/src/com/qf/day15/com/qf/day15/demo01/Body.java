package com.qf.day15.com.qf.day15.demo01;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo01
 * @created : 2020/8/7
 * @description :
 */
public class Body {
    public class heart{ //成员内部类
        public void beat(){
            System.out.println("心脏跳动......"+name);
        }
    }

    private String name;

    public void methodBody(){
        new heart().beat();
        System.out.println("外部类的方法");
    }

    public void setName(String name) {
        this.name = name;
    }
}
