package test2;

public class Test {
    public static void main(String[] args) {
      /*  Ticket ticket1=new Ticket("窗口一");
        Ticket ticket2=new Ticket("窗口二");
        Ticket ticket3=new Ticket("窗口三");
        Ticket ticket4=new Ticket("窗口四");
        ticket1.start();
        ticket2.start();
        ticket3.start();
        ticket4.start();*/
//        Thread t2=new Thread(new Ticket2(),"窗口一");
//        t2.start();
//        Thread t3=new Thread(new Ticket2(),"窗口二");
//        t3.start();
//        Thread t4=new Thread(new Ticket2(),"窗口三");
//        t4.start();
//        Thread t5=new Thread(new Ticket2(),"窗口四");
//        t5.start();
         Ticket2 ticket2=new Ticket2();
         Thread t1=new Thread(ticket2,"窗口一");
         Thread t2=new Thread(ticket2,"窗口二");
         Thread t3=new Thread(ticket2,"窗口三");
         Thread t4=new Thread(ticket2,"窗口四");
         t1.start();
         t2.start();
         t3.start();
         t4.start();
    }
}
