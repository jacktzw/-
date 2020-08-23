package test1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        ScheduledExecutorService sc = Executors.newScheduledThreadPool(3);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了.......");
            }
        };
        sc.schedule(runnable,1, TimeUnit.SECONDS);
        sc.schedule(runnable,1, TimeUnit.SECONDS);
        sc.schedule(runnable,1, TimeUnit.SECONDS);
        sc.schedule(runnable,1, TimeUnit.SECONDS);
        sc.schedule(runnable,1, TimeUnit.SECONDS);
        sc.schedule(runnable,1, TimeUnit.SECONDS);
        sc.shutdown();
        System.out.println(2<<3);
    }
}
