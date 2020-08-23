package test4;

public class Test {
    public static void main(String[] args) {
       Thread t1= new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=100; i++) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("守护线程:"+i);
                }

            }
        };
        Thread t2= new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=10; i++) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("子线程:"+i);
                }

            }
        };
       // t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
