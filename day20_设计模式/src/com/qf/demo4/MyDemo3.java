package com.qf.demo4;

import java.lang.reflect.Field;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo4
 * @created : 2020/8/14
 * @description :
 */
public class MyDemo3 {
    public static void main(String[] args) throws Exception {
        String className = "com.qf.demo4.Student";
        Class c = Class.forName(className);
        // 得到所有的属性
        Field [] fields = c.getDeclaredFields();
        for (Field field : fields) {
            if(field.getName().equals("id")) {
                // 得到上面的注解
                Id id = field.getDeclaredAnnotation(Id.class);
                if(id == null) {
                    System.out.println("没有此注解配置");
                }else {
                    String name = id.name();
                    System.out.println(name); // 输出配置
                }
            }
        }
    }
}
