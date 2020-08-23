package com.qf.day19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyDemo {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
		String name = "test.Student";
		// 加载类（创建类对象、类的描述信息所对应的对象）
		Class c = Class.forName(name); // 根据类的名称获取该类的描述信息
		// 得到类的名称
		String className = c.getName();
		System.out.println(className);
		// 得到类的短名称
		String shortName = c.getSimpleName();
		System.out.println(shortName);
		// 查看类的描述
		// 查看该类自定义的属性
		Field [] fields = c.getDeclaredFields();
		for (Field field : fields) {
			// 输出属性的访问修饰符、类型、名称
			System.out.println(Modifier.toString(field.getModifiers()) + " " +
					field.getType().getSimpleName() + " " + field.getName());
		}
		// 查看该类的自定义的方法
		Method [] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			// 输出属性的访问修饰符、返回值类型、名称
			System.out.println(Modifier.toString(method.getModifiers()) + " " +
					method.getReturnType().getSimpleName() + " "
					+ method.getName());
		}

		// 得到所有的构造方法
		Constructor [] cons = c.getConstructors();
		for (Constructor con : cons) {
			// 得到构造方法一切信息
			// 通过构造方法创建对象
			if(con.getParameterCount() == 2) {
				Object obj = con.newInstance(1, "张三");
				System.out.println(obj);
			}
		}

		// 创建
		Object obj = c.newInstance(); // 通过无参构造方法创建对象
		System.out.println(obj);

		// 给属性赋值
		Field [] fields1 = c.getDeclaredFields();
		for (Field field : fields1) {
			// 临时强行修改属性的访问权限(不推荐使用)
			field.setAccessible(true);
			// 给属性赋值（需要实例的操作）
			if(field.getName().equals("id")) {
				field.set(obj, 2);
			}else {
				field.set(obj, "李四");
			}
			// 打印属性的值
			System.out.println(field.get(obj));
		}
		System.out.println(obj);

		// 查看该类的自定义的方法
		Method [] methods1 = c.getDeclaredMethods();
		for (Method method : methods1) {
			if(method.getName().equals("setName")) {
				// 实例方法的调用，需要对象来操作，并且需要传递参数
				method.invoke(obj, "王五");
			}
		}
		System.out.println(obj);

		String methodName = "getName";
		//getName方法为无参方法
		Object getNameReturn = c.getMethod(methodName).invoke(obj);
		System.out.println(getNameReturn);
	}
}
