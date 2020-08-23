package test2;

public class Ticket2 implements Runnable {
    private int tikets=100;
    public Ticket2() {
    }
    @Override
    public   void run() {
        while(true){

                if(tikets<=0){
                    break;
                }
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + "还剩：" + tikets + "张票");
                    /**
                     *
                     *
                     *
                     *
                     *
                     *
                     *
                     *
                     *
                     *
                     */
                    --tikets;
                }

        }
    }
}
