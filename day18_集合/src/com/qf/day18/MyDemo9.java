package com.qf.day18;

import java.io.*;
import java.util.Properties;

public class MyDemo9 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        //往集合中添加数据
        p.setProperty("猪猪侠", "pig");
        p.setProperty("喜羊羊","sheep");
        p.setProperty("小熊熊","bear");
        PrintWriter pw=new PrintWriter("e:/s.txt");
        p.list(pw);
        pw.println("我是新增的内容哈~~~~");
        System.out.println(p.propertyNames()+"*******");
        pw.close();
        p.store(new FileWriter("e:/s.txt",true),"ss");
        Properties c=new Properties();
       /* p.store(new FileWriter("e:/s.txt",true),"ss");
        Properties c=new Properties();
        c.load(new FileReader("e:/s.txt"));
        c.stringPropertyNames().stream().forEach(s->System.out.println(s+"---"+c.getProperty(s)));*/
        c.stringPropertyNames().stream().forEach(s->System.out.println(s+"---"+c.getProperty(s)));


    }

}
