package test2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>(){

            @Override
            public Integer call() throws Exception {
                System.out.println(Thread.currentThread().getName() + "开始计算");
                int sum = 0;
                for (int i = 0; i <=100; i++) {
                    sum += i;
                    //Thread.sleep(10);
                }
                return sum;
            }
        };
        FutureTask<Integer> task=new FutureTask<>(callable);
        Thread t=new Thread(task);
        t.start();
        Integer integer = task.get();
        System.out.println(integer);
    }
}
