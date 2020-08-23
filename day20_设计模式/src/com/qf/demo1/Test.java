package com.qf.demo1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo1
 * @created : 2020/8/14
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        //开闭原则：对扩展开放，对修改关闭 如果一个类扩展功能或者修改功能，应该继承类的新功能，重写原来的方法或者修改
        for (int i = 0; i <20 ; i++) {
            Car car = CarFactory.BuildCar();
            System.out.println(car);
        }

    }
}
