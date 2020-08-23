package test4;

public class Xiaohua extends Thread{
    @Override
    public void run() {
        /*try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        synchronized (A.o2){
            System.out.println("小花拿到了筷子2");
            synchronized (A.o1){
                System.out.println("小花开始吃饭");
            }
        }
    }
}
