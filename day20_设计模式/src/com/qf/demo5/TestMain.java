package com.qf.demo5;

public class TestMain {
    public static void main(String[] args) {
        /*Thread t= new MyThred();
        t.start();
        Thread t1= new MyThred();
        t1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程============"+i);
        }*/
        Thread thread=new Thread(new MyRunnable());
        thread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程============"+i);

    }
    }
}
