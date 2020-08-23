package com.qf.demo4;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo4
 * @created : 2020/8/14
 * @description :
 */
public class Student {
    @Id(name = "stu_id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
