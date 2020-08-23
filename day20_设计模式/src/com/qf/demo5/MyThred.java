package com.qf.demo5;

public class MyThred extends Thread{
    public MyThred() {
    }

    public MyThred(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        System.out.println("子线程==================="+i);
        }
    }
}
