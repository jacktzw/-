package test4;

public class Ticket implements Runnable {
    private int ticket=100;
    Object o=new Object();
    @Override
    public void run() {
        while(true){
            a();
            if(ticket<=0){
                break;
            }
            }

        }

    public synchronized void a(){
        if(ticket<=0) {
            System.out.println(Thread.currentThread().getName() + "------票已售完");
            return;
        }
        //在没有进入锁内之前，任何位置都有可能被任何一个线程争抢到
        System.out.println(Thread.currentThread().getName()+"----------------");
        System.out.println(Thread.currentThread().getName()+"------还剩:"+ticket);
        ticket--;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
