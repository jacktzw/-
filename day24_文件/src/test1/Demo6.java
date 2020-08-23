package test1;

import java.io.*;
import java.util.Date;

public class Demo6 {
    public static void main(String[] args) throws Exception {
       /* PrintWriter pw=new PrintWriter(new FileWriter("e:print.txt",true));
        pw.println(34);
        pw.println("dfd");
        pw.println("哈哈");
        pw.println(new Date().getTime());
        pw.close();*/
        FileOutputStream fos = new FileOutputStream("e:\\info.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        for (int i = 0; i < 10; i++) {
            osw.write("我爱北京，我爱故乡\r\n");
        }
        osw.close();
        System.out.println("执⾏成功");
        //1创建OutputStreamWriter
        // FileOutputStream fos=new FileOutputStream("d:\\info.txt");
        // OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
        // 2写⼊    for(int i=0;i<10;i++) {      osw.write("我爱北京，我爱故乡\r\n");      osw.flush();    }
        // 3关闭    osw.close();    System.out.println("执⾏成功");
    }
}
