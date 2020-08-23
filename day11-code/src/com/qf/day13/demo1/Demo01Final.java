package com.qf.day13.demo1;

/**
 final的四种用法:
 1.可以修饰一个类
 2.可以修饰一个方法
 3.可以修饰一个局部变量
 4.可以修饰一个成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        Student stu1=new Student("赵立新");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        stu1=new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        final Student stu2=new Student("高圆圆");
//        stu2=new Student("343");
        stu2.setName("43");
        System.out.println(stu2.getName());
        Person person=new Person();
        Person person1=new Person("LILI");
        System.out.println(person.getName());
        System.out.println(person1.getName());
        Zi zi=new Zi();
        System.out.println(zi.age+zi.name);
    }
}
