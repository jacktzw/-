package test3;

public class Test {
    public static void main(String[] args) {
        MyThred1 t1=new MyThred1();
        Thread thread=new Thread(t1);
        thread.start();

    }
}
