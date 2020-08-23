package test1;

public class MyThred1 implements Runnable{
  // MyThred1 t1=new MyThred1();
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
        System.out.println(Thread.currentThread().getName()+":::"+i);
        }
    }
}
