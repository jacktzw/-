package test3;

import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

public class MyTicket implements Runnable{
    int ticket=100;
    ReentrantLock reent=new ReentrantLock();
    @Override
    public void run() {
        while(true){
            //线程进入之前加锁
            reent.lock();
            if(ticket<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"还剩"+ticket+"张票....");
            ticket--;
            reent.unlock();
            //线程解锁
        }
    }
}
