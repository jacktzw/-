package test5;

import java.io.File;
import java.util.Random;

public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        /*Random random=new Random();
        while(true){
            File file=new File("e:/test/"+random.nextInt(10000000));
            file.mkdirs();
            Thread.sleep(10);
        }*/

//        file.delete();
//        String a=" 34343.3434";
//        String[] split = a.split("\\.");
//        System.out.println(split[0].length());
        new Thread(()->{
            File file=new File("e:/test");
            File[] files = file.listFiles();
            for (File file1 : files) {
                if(file1.exists()){
                    file1.delete();
                }
            }
        }).start();
       /* new Thread(()->{
            Random random=new Random();
            while(true){
                File file=new File("e:/test/"+random.nextInt(10000000));
                file.mkdirs();
                try {
                    //Thread.sleep(2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }}).start();
        new Thread(()->{
            File file=new File("e:/test");
            File[] files = file.listFiles();
            for (File file1 : files) {
                if(file1.exists()){
                    file1.delete();
                }
            }
        }).start();*/
    }
}
