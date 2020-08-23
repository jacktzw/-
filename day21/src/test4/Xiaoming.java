package test4;

public class Xiaoming extends Thread{
    @Override
    public void run() {
        synchronized (A.o1){
            System.out.println("小明拿了筷子1");
            synchronized (A.o2){
                System.out.println("小花开始吃饭");
            }
        }
    }
}
