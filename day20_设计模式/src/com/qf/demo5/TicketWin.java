package com.qf.demo5;

public class TicketWin extends Thread{
    private int ticket=100;
    public TicketWin() {
        super();
    }

    public TicketWin(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            if(ticket<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"卖了第"+ticket+"张票");
            ticket--;
        }
    }
}
