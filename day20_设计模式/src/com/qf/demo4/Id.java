package com.qf.demo4;

import java.lang.annotation.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo4
 * @created : 2020/8/14
 * @description :
 */
@Documented // 可以生成文档
@Retention(RetentionPolicy.RUNTIME) // 当前注解在运行时起作用
@Target({ElementType.FIELD, ElementType.METHOD}) // 当前注解使用在什么（属性、方法、类）上面
public @interface Id {
     String name() default "id";
}
