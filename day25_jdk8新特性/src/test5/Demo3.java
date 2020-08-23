package test5;

public class Demo3 {
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(()->System.out.println("开始"));
    }
}
