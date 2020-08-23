package test3;

public class Demo1 {
    public static void main(String[] args) {
        MyTicket ticket=new MyTicket();
        Thread t1=new Thread(ticket,"窗口1");
        Thread t2=new Thread(ticket,"窗口2 ");
        Thread t3=new Thread(ticket,"窗口3");
        Thread t4=new Thread(ticket,"窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
