package test2;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        },"线程1").start();
        new Thread("线程2"){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(this.getName()+":"+i);
                }
            }
        }.start();*/
        Thread.sleep(2000);
        System.out.println("343");

    }
}
