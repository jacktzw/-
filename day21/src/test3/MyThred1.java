package test3;

public class MyThred1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i==5){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        System.out.println(Thread.currentThread().getName()+":::"+i);
        }
    }
}
