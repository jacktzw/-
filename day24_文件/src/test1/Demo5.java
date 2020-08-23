package test1;

import java.io.File;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        /**
         * 创建文件
         * new File("D:/1/2/3/4/5/a.txt");
         */
        /*File file=new File("e:/1/2/3/4/5/a.txt");
        System.out.println(file.getParentFile());
        if(!file.exists()){
            File parent = file.getParentFile();
            if(!parent.exists()){
                parent.mkdirs();
                file.createNewFile();
            }
            file.createNewFile();
        }*/
        File file=new File("","2.txt");
        file.createNewFile();
        System.out.println(file.getAbsolutePath());
    }
}
