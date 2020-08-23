package com.qf.day18;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day18
 * @created : 2020/8/12
 * @description :
 */
public class MyDemo2 {
    public static void main(String[] args) throws IOException {

        Collection<String> c=new ArrayList<>();
        c.add("fsd");
        c.add("bbb");
        int a[]={1,2};
//        b = iterator.hasNext();
//        next = iterator.next();
//        System.out.println(b+"----"+next);

       /* b = iterator.hasNext();
        next = iterator.next();
        System.out.println(b+"----"+next);*/


        //存放配置信息
//        Properties pro=new Properties();
//        pro.setProperty("username","root");
//        pro.setProperty(null,"4343");
//        pro.setProperty("password","root");
//        System.out.println(pro.get("password"));
        Properties pro1=new Properties();
//        //读取文件并加载文件信息
//        //\u6211\u559c\u6b22\u4f60 两个字节 unicode编码
//
//        char a='我';
//        System.out.println((int)a);
        InputStream in = MyDemo2.class.getResourceAsStream("/com/qf/day18/config.propertie");
        pro1.load(in);
        System.out.println(pro1.getProperty("username")+"----");
        System.out.println(pro1.getProperty("password")+"****");
        System.out.println(pro1.stringPropertyNames());
        System.out.println(pro1.propertyNames());

    }

}
