package test1;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        File file=new File("e:/s.txt");
        boolean s = file.createNewFile();
        System.out.println(s);
        System.out.println(file.length());

        File file1=new File("e:/s");
        file1.mkdir();

        //File file = new File("D:/a");
        //4.判断文件或文件夹是否存在
        //boolean b = file.exists();
        //System.out.println(b);


        //File file = new File("D:/a.txt");
        //5.判断是否是文件
        //boolean b = file.isFile();
        //System.out.println(b);
        //6.判断是否是文件夹
        //boolean b = file.isDirectory();
        //System.out.println(b);


        //File file = new File("D:/b.txt");
        //7.判断是否是隐藏文件
        //System.out.println(file.isHidden());
        //8.判断是否是可读文件
        //System.out.println(file.canRead());
        //9.判断是否可写文件
        System.out.println(file.canWrite());
    }
}
