package test2;

public class Ticket extends Thread {
    private  static int ticket=100;
    public Ticket() {
    }

    public Ticket(String name) {
        super(name);
    }

    @Override
    public  void run() {
        while(true){

            if(ticket<=0){
                break;
            }
            synchronized (this) {
                System.out.println(this.getName() + "还剩：" + ticket + "张票");
                ticket--;
            }
        }
    }
}
