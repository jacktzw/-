package com.qf.day13.demo1;

/**
 * 对于成员变量来说，如果用final修饰，那么这个变量也是照样不可变
 * 1.由于成员变量有默认值，所以成员变量赋值之后必须手动赋予，不会再给默认值了。
 * 2.对于final的成员变量，要么直接赋值，要么通过构造方法赋值二者选一个。
 * 3.必须保证当前类所有重载的构造方法，都最终会对final的成员变量进行赋值。
 */
public class Person {
    private final String name /*="鹿晗"*/;

    public Person() {
        name="关晓彤";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Person(String name) {
        this.name = name;
    }
}
