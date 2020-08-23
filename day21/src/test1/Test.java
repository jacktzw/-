package test1;

public class Test {
    public static void main(String[] args) {
        /**
         * 多线程的特点：
         * 1.交替执行，每个线程都会强夺cpu的执行权
         * 2.随机性
         * 主线程、main线程
         */
        //主线程

        Thread t1=new MyThred3();
        t1.start();
        Thread t2=new MyThred2();
        t2.start();
    }
}
