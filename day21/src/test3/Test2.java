package test3;

public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }, "线程1");
        Thread t2 = new Thread("线程2") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i==10) {
                        try {
                            t1.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(this.getName() + ":" + i);
                }
            }
        };

        t1.start();
        t2.start();
    }
}
