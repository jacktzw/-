public class Product implements Runnable {
    private BreadCon con;//面包店对象

    public Product(BreadCon con) {
        this.con = con;
    }
    //一次性最多生产30个面包
    @Override
    public void run() {
        for (int i = 1; i <=300; i++) {
            con.put(new Bread(i,Thread.currentThread().getName()));
        }
    }
}
