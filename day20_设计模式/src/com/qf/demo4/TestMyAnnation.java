package com.qf.demo4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestMyAnnation {
    public static void main(String[] args) throws Exception {
        Class<?> c=Class.forName("com.qf.demo4.Car");
        MyAnotation annotation = c.getAnnotation(MyAnotation.class);
        MyAnotation ss = c.getDeclaredAnnotation(MyAnotation.class);
        System.out.println(ss);
        System.out.println(annotation);
        String name = ss.name();
        String method = ss.method();
        System.out.println(name+"-----"+method);
        System.out.println("******************");
        Class<?> c1 = Class.forName(name);
        Method method1 = c1.getMethod(method);
        method1.invoke(c1.newInstance());
    }
}
