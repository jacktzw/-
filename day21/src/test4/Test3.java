package test4;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Xiaohua xiaohua=new Xiaohua();
        Xiaoming xiaoming=new Xiaoming();
        xiaoming.join();
        xiaohua.start();
        xiaoming.start();
    }
}
