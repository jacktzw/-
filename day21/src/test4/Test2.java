package test4;

public class Test2 {
    public static void main(String[] args) {
        Ticket t1=new Ticket();
        Thread thread1=new Thread(t1,"窗口1");
        Thread thread2=new Thread(t1,"窗口2");
        Thread thread3=new Thread(t1,"窗口3");
        Thread thread4=new Thread(t1,"窗口4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
