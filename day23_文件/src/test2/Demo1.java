package test2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 文件读取流对象 FileRead
         * 该对象可以用于读取指定文件中的内容
         * 在构造对象的时候指定读取的文件路径
         */
        FileReader fr=new FileReader("D:/a.txt ");
        int ch=0;
        while((ch=fr.read())!=-1){
           System.out.println((char)ch);
       }
        int i=-1;
        System.out.println((char)i);
/*
        int count = 1; //记录汉字的个数

        for(char c = '\u4e00'; c <= '\u8c9f'; c++ ) {

            System.out.print(c + "\t");

            count++;

            if (count % 10 == 0) {

                System.out.println("");

            }

        }

        System.out.println(count);*/




    }
}
