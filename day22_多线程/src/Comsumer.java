public class Comsumer implements Runnable {
    private BreadCon con;

    public Comsumer(BreadCon con) {
        this.con = con;
    }
    //消费面包
    @Override
    public void run() {
        for (int i = 1; i <=300; i++) {
            con.consume();
        }
    }
}
