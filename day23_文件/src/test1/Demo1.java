package test1;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("e:\\c.txt",false);
        fw.write("我是原来的数据");
        fw.write("\n\rhello,world");

        fw.close();

    }
}
