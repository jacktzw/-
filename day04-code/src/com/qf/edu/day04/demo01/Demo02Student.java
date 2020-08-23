package com.qf.edu.day04.demo01;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.edu.day04.demo01
 * @created : 2020/8/1
 * @description :
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student stu=getStudent();
        System.out.println(stu.name);
        System.out.println(stu.age);
        String str=new String();

    }
    public static  Student getStudent(){
        Student stu=new Student();
        stu.age=18;
        stu.name="涂志文";
        return stu;
    }
}
