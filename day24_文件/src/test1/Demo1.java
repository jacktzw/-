package test1;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 转换流
         */
        FileOutputStream fos=new FileOutputStream("e:/s.txt");
        OutputStreamWriter os=new OutputStreamWriter(fos,"gbk");
        FileInputStream fis=new FileInputStream("e:/s.txt");
        InputStreamReader isr=new InputStreamReader(fis,"gbk");
        os.write("abc");
        os.write("哈哈哈");
        os.close();
        int num=0;
        StringBuffer sb=new StringBuffer();
        while((num=isr.read())!=-1){
            System.out.println(num);
            sb.append((char)num);
        }
        System.out.println(sb);
        isr.close();
        //创建一个file对象绑定文件夹或者文件
        File file=new File("e:/s.txt");
        System.out.println(file.length());

    }
}
