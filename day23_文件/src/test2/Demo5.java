package test2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符缓冲区流:提高对数据的读取和写入的效率
         * 缓冲区的两个基类
         * bufferedWriter bufferedReader
         */
        FileWriter fw=new FileWriter("d:/b.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("sfsfd");
        bw.newLine();
        bw.write("哈哈哈");
        bw.close();

    }
}
