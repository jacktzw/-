package test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:\\Users\\14118\\Pictures\\Saved Pictures\\头像.jpg");
       // FileInputStream fis=new FileInputStream("d:/a.txt");
        FileOutputStream fos=new FileOutputStream("E:/new.jpg");
        byte[] buf=new byte[1024];
        int num;
        //System.out.println(fis.available());
        while((num=fis.read(buf))!=-1){
            fos.write(buf,0,num);
            System.out.println(num);
        }
       /* System.out.println(fis.available()/1024+"kb");
        byte[] b=new byte[fis.available()];
        int read = fis.read(b);
        System.out.println(read);
        fos.write(b);*/
        fis.close();
        fos.close();
    }
}
