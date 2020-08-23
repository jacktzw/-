package test2;

import java.io.File;

public class Demo7 {
    public static void main(String[] args) {
        /**
         * 字节流 outputstream inputstream
         * 文件字节读取流 文件字节写入流
         *
         */
        File file=new File("e:/1/2/3/4/5/a.txt");
        System.out.println("路径分隔符: "+File.pathSeparator);
        System.out.println("名称分隔符:"+File.separator);
        System.out.println(file.getParent());
    }
}
