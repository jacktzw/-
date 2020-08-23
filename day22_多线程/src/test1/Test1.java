package test1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        ExecutorService es1 = Executors.newCachedThreadPool();
        ExecutorService es2 = Executors.newSingleThreadExecutor();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了.......");
            }
        };
        es.submit(runnable);
        es.submit(runnable);
        es.submit(runnable);
        es.submit(runnable);
        es.submit(runnable);
        es.submit(runnable);
        es.submit(runnable);
        es.submit(runnable);
        es.shutdown();
     /*  es1.submit(runnable);
       es1.submit(runnable);
       es1.submit(runnable);
       es1.submit(runnable);
       es1.submit(runnable);
       es1.submit(runnable);
       es1.submit(runnable);
       es1.submit(runnable);
       es1.submit(runnable);
       es1.shutdown();*/
      /*  es2.submit(runnable);
        es2.submit(runnable);
        es2.submit(runnable);
        es2.submit(runnable);
        es2.submit(runnable);
        es2.submit(runnable);
        es2.submit(runnable);
        es2.submit(runnable);
        es2.submit(runnable);
        es2.shutdown();*/

    }
}
