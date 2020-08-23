package test;

import java.lang.reflect.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  test
 * @created : 2020/8/13
 * @description :
 */
public class MyTest {
    public static void main(String[] args) throws Exception {
        String name = "test.Person";
        Class c = Class.forName(name);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println(c.getPackage());
        System.out.println("====================");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            //输出属性的访问修饰符 类型 名称
            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
        }
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getSimpleName() + " " + method.getName());
            System.out.println(method.getParameterCount());
            Parameter[] parameters = method.getParameters();
        }
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + "--" + constructor.getParameterCount());
            if (constructor.getParameterCount() == 2) {
                Object o = constructor.newInstance("张三", 20);
                System.out.println(o);
            }
        }
        //直接创建对象通过无参构造方法
        Object o = c.newInstance();
        System.out.println(o);
        // 给属性赋值
//        Field[] fs = c.getDeclaredFields();
//        for (Field f : fs) {
//            f.setAccessible(true);
//            if (f.getName().equals("name")) {
//                f.set(o, "张三");
//            } else if (f.getName().equals("age")) {
//                f.set(o, 17);
//            }
//
//        }
        //查看该类的自定义方法
//        Method[] method1 = c.getDeclaredMethods();
//        for (Method method : method1) {
//            if (method.getName().equals("say") && method.getParameterCount() == 0) {
//                method.invoke(o);
//            } else if (method.getName().equals("say") && method.getParameterCount() == 1) {
//                method.invoke(o, "亮亮");
//            }
//        }
        //System.out.println(o);
        //toString为无参构造方法
        String methodname="say";
        c.getMethod(methodname).invoke(o);
        c.getMethod(methodname,String.class).invoke(o,"亮亮");

        //c.getMethod("toString");
    }
}
